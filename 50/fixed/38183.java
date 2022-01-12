private void formNewSubstring() {
    if ((tail.length()) < (buffer)) {
        tail += java.lang.Long.toString(((counter)++));
        formNewSubstring();
    }
}