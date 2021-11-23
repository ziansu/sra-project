protected void finalize() throws java.lang.Throwable {
    glDeleteTextures(id);
    super.finalize();
}