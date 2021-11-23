public void setId(int id) {
    if ((this.id) != id) {
        this.id = id;
        checkedNotifyObserver();
    }
}