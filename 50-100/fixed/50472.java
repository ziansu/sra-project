float calculatePrice() {
    float standardShipping = ((float) ((20 * (weight)) * (quantity)));
    return ((float) ((((price) * 1.1) * (quantity)) + (shipping ? 1.2 * standardShipping : standardShipping)));
}