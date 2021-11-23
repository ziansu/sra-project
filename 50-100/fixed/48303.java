public ru.lanwen.jenkins.juseppe.files.WatchFiles configureFor(ru.lanwen.jenkins.juseppe.props.Props props) throws java.io.IOException {
    this.props = props;
    path = java.nio.file.Paths.get(props.getPluginsDir());
    this.keys = new java.util.HashMap<>();
    setName(java.lang.String.format("file-watcher-%s", path.getFileName()));
    watcher = this.path.getFileSystem().newWatchService();
    walkAndRegisterDirectories(path);
    return this;
}