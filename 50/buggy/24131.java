private void setLabels() {
    java.lang.String name = account.getName();
    idLabel.setText((name.equals("") ? java.lang.String.valueOf(id) : name));
    amountLabel.setText(account.toString());
}