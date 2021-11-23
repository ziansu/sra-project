public void setWordwrap(final java.lang.String wordwrap) {
    try {
        int ww = java.lang.Integer.parseInt(wordwrap);
        if (ww >= 0) {
            this.wordwrap = ww;
        }
    } catch (java.lang.Throwable ignore) {
    }
}