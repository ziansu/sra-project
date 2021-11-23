private int calculatePrice() {
    int price = (quantity) * (pricePerCoffee);
    if (hasWhippedCream)
        price++;
    
    if (hasChocolate)
        price += 2;
    
    return price;
}