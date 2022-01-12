double calculatePrice() {
    double tax_cost;
    if (Assignment3.Electronics.EXCEPTION_STATES.contains(state)) {
        if (Assignment3.Electronics.EXSTATES.contains(state)) {
            Assignment3.ca000355501033e9876c4f739594b32 tax_cost = 0;
        }else {
            tax_cost = (this.price) * 0.1;
        }
        double shipping_cost = 20 * (this.weight);
        if (this.fragile) {
            shipping_cost = shipping_cost * 1.2;
        }
        double final_price = (quantity) * ((tax_cost + shipping_cost) + (price));
        return final_price;
    }
}