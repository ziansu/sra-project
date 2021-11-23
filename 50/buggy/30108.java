@java.lang.Override
public void onClick(android.view.View v) {
    com.mobile.paolo.listaspesa.utility.GlobalValuesManager.getInstance(getContext()).saveIsUserCreatingShoppingList(true);
    showListCreationFragment();
}