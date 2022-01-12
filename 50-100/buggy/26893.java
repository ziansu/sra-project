@java.lang.Override
public void onFailure(java.lang.Throwable throwable) {
    retFuture.setException(throwable);
    com.google.common.util.concurrent.CheckedFuture<java.lang.Void, org.opendaylight.distributed.tx.api.DTxException.RollbackFailedException> rollExcept = rollback();
    com.google.common.util.concurrent.Futures.addCallback(rollExcept, new com.google.common.util.concurrent.FutureCallback<java.lang.Void>() {
        @java.lang.Override
        public void onSuccess(@javax.annotation.Nullable
        java.lang.Void aVoid) {
            retFuture.setException(new org.opendaylight.controller.md.sal.common.api.data.ReadFailedException("Failed to merge but succeed to rollback"));
        }

        @java.lang.Override
        public void onFailure(java.lang.Throwable throwable) {
            retFuture.setException(throwable);
        }
    });
}