public void setPosition(int position) {
    junit.framework.Assert.assertTrue(((0 <= position) && (position <= (data.length))));
    readPosition = position;
    peekPosition = position;
}