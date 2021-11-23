float calculatePrice() {
    float standardShipping = ((float) ((20 * (weight)) * (quantity)));
    return ((float) (((price) * 1.1) + (shipping ? 1.2 * standardShipping : standardShipping)));
}