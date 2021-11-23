@java.lang.Override
public long length() throws java.io.IOException {
    return this.max(((this.fileendpos) + 1), this.initfilelen);
}