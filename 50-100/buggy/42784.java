public void back() throws org.json.JSONException {
    if ((this.usePrevious) || ((this.index) <= 0)) {
        throw new org.json.JSONException("Stepping back two steps is not supported");
    }
    this.index -= 1;
    this.character -= 1;
    this.usePrevious = true;
    this.eof = false;
}