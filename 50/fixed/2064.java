public void captureString(int length) {
    myCaptures.add(new java.lang.String(myCodepoints, mySavedOffset.peek(), length));
}