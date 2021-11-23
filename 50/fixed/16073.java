@java.lang.Override
public void setProductTextName(java.lang.String productName) {
    this.productName = productName;
    textViewProductName.setText((productName + " from..."));
}