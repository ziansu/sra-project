@java.lang.Override
public void run() {
    mUpdate.update(this, new com.joylabs.mclubtracker.transactions.updateposition.UpdateListerner() {
        @java.lang.Override
        public void onCompleted(boolean succeed) {
            if ((mHandler) != null) {
                if (com.joylabs.mclubtracker.transactions.user.UserInfo.getInstance().getPostPostion()) {
                    mHandler.postDelayed(mRunnable, ((com.joylabs.mclubtracker.transactions.user.UserInfo.getInstance().getPostinterval()) * 1000));
                }
            }
        }
    }, false);
}