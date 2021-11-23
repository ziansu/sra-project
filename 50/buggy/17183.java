@java.lang.Override
public void setLength(long newLength) throws java.io.IOException {
    if (newLength > 0) {
        this.fileendpos = newLength - 1;
    }else {
        this.fileendpos = 0;
    }
    super.setLength(newLength);
}