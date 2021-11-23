public void setPrice(double price) {
    if (price < 0)
        this.price = 0;
    else
        this.price = price;
    
}