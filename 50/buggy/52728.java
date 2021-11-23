public void setPrice(long price) {
    if (price < 0)
        price = 0;
    
    this.price = price;
}