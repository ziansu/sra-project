public io.dunham.raku.viewmodel.DocumentVM withFiles(java.util.Collection<io.dunham.raku.model.File> files) {
    this.files = files.stream().map(FileVM::new).collect(java.util.stream.Collectors.toSet());
    return this;
}