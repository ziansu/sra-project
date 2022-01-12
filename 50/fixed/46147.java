private void nextComment() {
    source.nextChar();
    while (!(source.atLineEnd())) {
        source.nextChar();
    } 
    source.nextChar();
}