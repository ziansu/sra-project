public double setTotalAmountTextView() {
    double value = 0.0;
    for (APIResponse.CartPartDetail part : cartProductsList) {
        value = value + (part.getShippingCharges());
    }
    return value;
}