double calculateTotal() {
    subtotal = calculateSubtotal();
    tax = calculateTax();
    total = 0;
    total = (tax) + (subtotal);
    return total;
}