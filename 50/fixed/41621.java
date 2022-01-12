private void Load() {
    if ((file.exists()) && ((file.lastModified()) != (lastModified))) {
        parse();
    }
}