@java.lang.Override
public void setLength(long newLength) throws java.io.IOException {
    if (newLength > 0) {
        fileendpos = newLength - 1;
    }else {
        fileendpos = 0;
    }
    super.setLength(newLength);
}