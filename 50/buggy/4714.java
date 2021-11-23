@java.lang.Override
public void updateItem(BasicCommonClasses.Ingredient item, boolean empty) {
    super.updateItem(item, empty);
    if ((item == null) || empty)
        return ;
    
    this.setText(item.getName());
}