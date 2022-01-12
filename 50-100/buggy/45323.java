public void addConfiguredSPK(net.filebot.ant.spk.RepositoryTask.SPK spk) {
    if ((spk.file) != null) {
        if (((spk.url) != null) || (spk.file.exists())) {
            spks.add(spk);
        }
        throw new org.apache.tools.ant.BuildException(("File not found: " + (spk.file)));
    }
    throw new org.apache.tools.ant.BuildException("Required attributes: [file] or [url, file]");
}