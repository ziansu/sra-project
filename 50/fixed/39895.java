public void setPointed(boolean pointed) {
    if (pointed) {
        setBackgroundResource(R.color.pointerCell);
    }else {
        setBackgroundColor(Color.TRANSPARENT);
    }
}