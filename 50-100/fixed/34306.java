public void setItems(java.util.List<? extends T> list) {
    synchronized(itemsMutex) {
        this.items = list;
        if (!(items.contains(activeItem))) {
            if ((items.size()) > 0) {
                activeItem = items.get(0);
            }else {
                activeItem = null;
            }
        }
    }
}