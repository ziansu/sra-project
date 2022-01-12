private void updateitemlabel(Order currOrder) {
    java.lang.System.out.println("updateitemlabel runned");
    lblDiscount.setText((("($" + (currentOrder.getDiscount())) + ")"));
    lblSubTotal.setText(("$" + (currentOrder.getSubtotal())));
    lblTax.setText(("$" + (currentOrder.getTax())));
    lblTotal.setText(("$" + (currentOrder.getTotal())));
}