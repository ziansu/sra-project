public double getTotal() {
    if ((modified_price) <= 0)
        total = (quantity) * (selling_price);
    else
        total = modified_price;
    
    return total;
}