private void startDownload(java.lang.String idLesson, java.lang.String url, java.lang.String downloadType) {
    intentDownloadAll = new android.content.Intent(getActivity(), com.erpdevelopment.vbvm.service.DownloadAllService.class);
    intentDownloadAll.putExtra("idLesson", idLesson);
    intentDownloadAll.putExtra("url", url);
    intentDownloadAll.putExtra("downloadType", downloadType);
    getActivity().startService(intentDownloadAll);
    com.erpdevelopment.vbvm.service.DownloadAllService.incrementCount();
}