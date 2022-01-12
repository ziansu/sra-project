public java.lang.String getInput() {
    readInput = true;
    if (inputReady) {
        return input.substring(0, ((input.length()) - 1));
    }else {
        return null;
    }
}