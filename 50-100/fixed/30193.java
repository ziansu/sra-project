private void updateIngredientsCheckList() {
    CustomerContracts.ICustomer customer = UtilsImplementations.InjectionFactory.getInstance(CustomerImplementations.Customer.class);
    try {
        ingredientsObservableList.addAll(customer.getAllIngredients());
    } catch (SMExceptions.SMException e) {
        CustomerGuiHelpers.CustomerGuiExceptionsHandler.handle(e);
    }
    ingredientsCheckListView.setItems(ingredientsObservableList);
    java.util.HashSet<BasicCommonClasses.Ingredient> currentAllergans = TempCustomerProfilePassingData.customerProfile.getAllergens();
    if ((currentAllergans != null) && (!(currentAllergans.isEmpty()))) {
        updateListViewWithChosenIngreidients(currentAllergans);
    }
}