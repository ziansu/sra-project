public void setUnreadTime(final long unreadTime) {
    if ((unreadTime > 0L) && (unreadTime <= (this.unreadTime)))
        return ;
    
    this.unreadTime = unreadTime;
    for (int i = 0; i < (this.listAdaptor.getCount()); i++) {
        if ((this.listAdaptor.getItemTime(i)) <= (this.unreadTime)) {
            this.bar.setUnreadPosition(i);
            return ;
        }
    }
}