public void rename(utils.FileExtension to) throws java.io.IOException {
    cut(to);
    file = to.file;
}