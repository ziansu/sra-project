public static void main(java.lang.String[] args) {
    java.lang.String costString;
    double cost;
    final double tax = 0.06;
    costString = javax.swing.JOptionPane.showInputDialog(null, ("Enter price of item you are buying" + "\nPurchases"));
    cost = java.lang.Double.parseDouble(costString);
    javax.swing.JOptionPane.showMessageDialog(null, ((("With " + (tax * 100)) + "% tax,  purchase  is $") + (cost - (cost * tax))));
}