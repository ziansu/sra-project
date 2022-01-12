@java.lang.Override
public void write(java.lang.String str, int off, int len) throws java.io.IOException {
    super.write(crypterCaesar.encrypt(str.substring(off, len)), off, len);
}