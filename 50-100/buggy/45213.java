@java.lang.Override
public void updateAmount(java.lang.Float amount) {
    txtviewTotal.setText("");
    txtviewTotal.setText(getResources().getText(R.string.message_lista_total_cartera));
    txtviewTotal.setText((((txtviewTotal.getText()) + " ") + (java.lang.String.valueOf(amount))));
}