@java.lang.Override
void setQuantity(int sign, int quantity) {
    if ((java.lang.Math.abs(quantity)) >= ((BYTE_SIZE) * (BYTE_SIZE))) {
        throw new java.lang.IllegalArgumentException("Doesn't fit in two bytes.");
    }
    super.setQuantity(sign, quantity);
}