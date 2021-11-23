private void downloadContent(boolean manualDownload) {
    thestral.agc.IDownloadTask downloadContacts = new thestral.agc.contact.ContactDownloadTask(getActivity(), manualDownload);
    thestral.agc.IDownloadTask downloadContactInformation = new thestral.agc.contact.ContactInformationDownloadTask(getActivity(), true);
    thestral.agc.BackgroundDownloader backgroundDownloader = new thestral.agc.BackgroundDownloader(getActivity(), this);
    backgroundDownloader.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, downloadContacts, downloadContactInformation);
}