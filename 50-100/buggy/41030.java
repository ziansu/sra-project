public void setIndentLength(int indentLength) {
    if (indentLength < 0) {
        throw new java.lang.IllegalArgumentException("indentLength can't less 0");
    }
    if (indentLength >= (mLineTextLength)) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("indentLength '%s' can't >= mLineTextLength '%s'", indentLength, mLineTextLength));
    }
    this.mIndentLength = indentLength;
}