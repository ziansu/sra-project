@java.lang.Override
public void run() {
    updateSearchItemsWithTokens(newValue);
    if (!(isChecked)) {
        getItems().clear();
        getItems().addAll(items);
    }else
        isChecked = false;
    
    show();
}