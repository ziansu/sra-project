@java.lang.Override
public void end() {
    final int finalOffset = correctOffset(this.charsRead);
    this.offsetAtt.setOffset(finalOffset, finalOffset);
}