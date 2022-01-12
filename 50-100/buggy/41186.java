private void onStatusChanged(final byte status) {
    if ((model.getStatus()) == (com.liulishuo.filedownloader.model.FileDownloadStatus.paused)) {
        if (com.liulishuo.filedownloader.util.FileDownloadLog.NEED_LOG) {
            com.liulishuo.filedownloader.util.FileDownloadLog.d(this, ("High concurrent cause, Already paused and we don't " + "need to call-back to Task in here, %d"), model.getId());
        }
        return ;
    }
    com.liulishuo.filedownloader.message.MessageSnapshotFlow.getImpl().inflow(com.liulishuo.filedownloader.message.MessageSnapshotTaker.take(status, model, processParams));
}