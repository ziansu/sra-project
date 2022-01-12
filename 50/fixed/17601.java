public void emtyFile() throws java.io.IOException {
    this.close();
    this.f.delete();
    this.f.createNewFile();
    this.open();
}