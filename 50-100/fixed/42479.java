protected void onPostExecute(com.wfcrc.SplashActivity.SplashCallback callback) {
    if ((mDocumentGallery) != null) {
        if (!(mDocumentGallery.isEmpty())) {
            com.wfcrc.sqlite.WFCRCDB db = new com.wfcrc.sqlite.WFCRCDB(mContext);
            db.deleteDocuments();
            db.insertDocuments(mDocumentGallery);
        }
    }
    callback.proceedWithLaunching();
}