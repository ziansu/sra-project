public void addConfiguredSPK(net.filebot.ant.spk.RepositoryTask.SPK spk) {
    if ((((spk.file) != null) && ((spk.url) != null)) || (((spk.file) != null) && (spk.file.exists()))) {
        spks.add(spk);
    }else {
        throw new org.apache.tools.ant.BuildException("Required attributes: [file] or [url, file]");
    }
}