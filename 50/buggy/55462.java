public void setPrice(java.lang.Double price) {
    if (price < 0)
        this.price = 0;
    else
        this.price = price;
    
}