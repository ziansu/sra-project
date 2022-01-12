public void addToppingToList(android.view.View view) {
    android.widget.Spinner topping = ((android.widget.Spinner) (findViewById(R.id.sprAllToppings)));
    java.lang.String selectedTopping = java.lang.String.valueOf(topping.getSelectedItem());
    list.add(selectedTopping);
    android.widget.Spinner sprPizzaToppings = ((android.widget.Spinner) (findViewById(R.id.sprSelectedPizzaToppins)));
    android.widget.ArrayAdapter<java.lang.String> arrayAdapter = new android.widget.ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
    arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    sprPizzaToppings.setAdapter(arrayAdapter);
}