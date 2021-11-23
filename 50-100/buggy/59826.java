public hudson.model.DownloadService.Downloadable createDownloadable() {
    final hudson.model.Descriptor d = jenkins.model.Jenkins.getActiveInstance().getDescriptor(getId());
    if (d instanceof hudson.tools.DownloadFromUrlInstaller.DescriptorImpl) {
        final hudson.tools.DownloadFromUrlInstaller.DescriptorImpl delegate = ((hudson.tools.DownloadFromUrlInstaller.DescriptorImpl) (d));
        return new hudson.model.DownloadService.Downloadable(getId()) {
            public net.sf.json.JSONObject reduce(java.util.List<net.sf.json.JSONObject> jsonList) {
                return delegate.reduce(jsonList);
            }
        };
    }
    return new hudson.model.DownloadService.Downloadable(getId());
}