@java.lang.Override
public java.lang.String copy(long start, long len) {
    java.lang.String result = this.mark().position((start - 1)).copyNext(len);
    this.resetToMark();
    return result;
}