@java.lang.Override
public java.lang.String copy(long start, long len) {
    java.lang.String result = this.mark().position(start).copyNext(len);
    this.resetToMark();
    return result;
}