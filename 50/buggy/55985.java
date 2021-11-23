public void offsetBladder(double amount) {
    bladder += amount;
    lblBladder.setText((("Bladder: " + ((int) (bladder))) + "%"));
}