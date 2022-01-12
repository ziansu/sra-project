@java.lang.Override
public void paste() {
    int oldlength = this.getText().length();
    int posOfEnter = this.getText().lastIndexOf("\n");
    super.paste();
    int diff = ((this.getText().length()) - oldlength) - 1;
    currentLine = this.getText().substring((posOfEnter + 3), this.getText().length());
    charCounterInLine += diff;
    currentPosInLine += diff;
}