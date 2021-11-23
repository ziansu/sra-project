public void computeTotal() {
    this.total = 0;
    for (bean.CartItemBean cItem : this.items) {
        this.total += cItem.getPrice();
    }
}