private void commitSpaceJustOne() {
    java.lang.CharSequence seq = mInputConnection.getTextBeforeCursor(1, 0);
    if (((seq.length()) > 0) && ((seq.charAt(0)) != ' ')) {
        commitText(" ");
    }
}