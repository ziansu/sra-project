public void setPointed(boolean pointed) {
    this.pointed = pointed;
    if (pointed) {
        setBackgroundResource(R.color.pointerCell);
    }else {
        setBackgroundColor(Color.TRANSPARENT);
    }
}