public hudson.model.DownloadService.Downloadable createDownloadable() {
    if ((this) instanceof hudson.tools.DownloadFromUrlInstaller.DescriptorImpl) {
        final hudson.tools.DownloadFromUrlInstaller.DescriptorImpl delegate = ((hudson.tools.DownloadFromUrlInstaller.DescriptorImpl) (this));
        return new hudson.model.DownloadService.Downloadable(getId()) {
            public net.sf.json.JSONObject reduce(java.util.List<net.sf.json.JSONObject> jsonList) {
                return delegate.reduce(jsonList);
            }
        };
    }
    return new hudson.model.DownloadService.Downloadable(getId());
}