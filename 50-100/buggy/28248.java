@java.lang.Override
public java.lang.String getLine(int index) {
    if (index == (this.lineCount)) {
        return this.text.substring(this.lineStarts[(index - 1)], this.lineEnd(this.text.length()));
    }
    if (index < (this.lineCount)) {
        return this.text.substring(this.lineStarts[(index - 1)], this.lineEnd(this.lineStarts[index]));
    }
    return null;
}