public void decrement(android.view.View view) {
    (quantity)--;
    if ((quantity) < 0) {
        quantity = 0;
    }
    display(quantity);
}