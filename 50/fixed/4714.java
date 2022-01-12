@java.lang.Override
public void updateItem(BasicCommonClasses.Ingredient item, boolean empty) {
    if ((item == null) || empty)
        return ;
    
    super.updateItem(item, empty);
    setText(item.getName());
}