public void decrement(android.view.View view) {
    if ((quantity) == 1) {
        android.widget.Toast.makeText(this, "You can not order less than 1 cup of coffee", Toast.LENGTH_SHORT).show();
    }else {
        quantity = (quantity) - 1;
        display(quantity);
    }
}