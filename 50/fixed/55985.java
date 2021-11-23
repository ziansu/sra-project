public void offsetBladder(double amount) {
    bladder += amount;
    lblBladder.setText((("Bladder: " + (java.lang.Math.round(bladder))) + "%"));
}