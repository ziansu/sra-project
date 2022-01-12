public void setUnreadTime(final long unreadTime) {
    this.unreadTime = unreadTime;
    for (int i = 0; i < (this.listAdaptor.getCount()); i++) {
        if ((this.listAdaptor.getItemTime(i)) <= (this.unreadTime)) {
            this.bar.setUnreadPosition(i);
            return ;
        }
    }
}