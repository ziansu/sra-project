public void setDiscount(double discount) {
    if (discount == 0) {
        offeredPrice = false;
        finalPrice = price;
        this.discount = discount;
        return ;
    }else
        if (discount > 1) {
            return ;
        }
    
    this.offeredPrice = true;
    this.discount = discount;
    this.finalPrice = ((int) (java.lang.Math.round(((price) * (1 - discount)))));
}