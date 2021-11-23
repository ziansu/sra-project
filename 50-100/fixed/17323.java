@java.lang.Override
float calculatePrice() {
    float final_price = (this.price) * (this.quantity);
    float shipping_price = (20 * (this.weight)) * (this.quantity);
    if ((this.perishable) == true) {
        shipping_price += shipping_price * (Assignment3.Grocery.PREMIUM);
    }
    final_price = final_price + shipping_price;
    return final_price;
}