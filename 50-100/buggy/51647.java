public double getSalesTax() {
    double rate = 0;
    double tax = 0;
    if (exempt)
        rate = 0;
    else
        rate = Item.salesTaxRate;
    
    if (imported)
        rate += Item.importTaxRate;
    
    tax = (java.lang.Math.round(((rate * (price)) * 20.0))) / 20.0;
    return tax;
}