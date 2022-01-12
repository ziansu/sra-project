public void setLatestItem(Item item) {
    if ((this.item) == null) {
        this.item = item;
    }else {
        if ((this.item.getVersion()) < (item.getVersion())) {
            this.item = item;
        }
    }
    this.incrementCounter();
}