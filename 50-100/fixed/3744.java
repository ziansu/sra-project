public void setTitle(java.lang.String title) {
    if (title == null) {
        throw new java.lang.NullPointerException();
    }
    if (title.equals("")) {
        throw new java.lang.IllegalArgumentException();
    }
    this.title = title;
    setChanged();
    notifyObservers(title);
}