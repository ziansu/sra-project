float calculatePrice() {
    float final_price = (this.price) * (this.quantity);
    float shipping_price = (20 * (this.weight)) * (this.quantity);
    final_price = final_price + shipping_price;
    return final_price;
}