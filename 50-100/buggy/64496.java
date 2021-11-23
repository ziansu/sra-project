@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String quantityText = quantity_input.getText().toString();
    dbPopulator.getGroceriesListHandler().addGroceriesList(new yithian.cosacompro.db.dbclasses.GroceriesList(java.lang.Integer.parseInt(quantityText), defaultList, productIdSelected[0]));
    clearAddProductToListFields();
    inputMethodManager.hideSoftInputFromWindow(main_activity.getCurrentFocus().getWindowToken(), 0);
    addProductToListLayout.setVisibility(View.INVISIBLE);
    generateDefaultList();
}