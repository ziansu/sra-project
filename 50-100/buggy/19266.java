private io.reactivex.Observable<zlc.season.rxdownload.entity.DownloadStatus> rangeSave(final long start, final long end, final int i, final okhttp3.ResponseBody response) {
    return io.reactivex.Flowable.create(new io.reactivex.FlowableOnSubscribe<zlc.season.rxdownload.entity.DownloadStatus>() {
        @java.lang.Override
        public void subscribe(io.reactivex.FlowableEmitter<zlc.season.rxdownload.entity.DownloadStatus> emitter) throws java.lang.Exception {
            mDownloadHelper.saveRangeFile(emitter, i, start, end, mUrl, response);
        }
    }, BackpressureStrategy.LATEST).toObservable();
}