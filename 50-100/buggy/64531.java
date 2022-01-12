@java.lang.Override
public void initializeData() {
    if (moneyDeal) {
        owner.setDocument(new king.flow.action.DefaultTextFieldAction.MoneyInputLimit());
    }else
        if ((type) == (king.flow.action.DefaultTextFieldAction.InputType.NUMBER)) {
            owner.setDocument(new king.flow.action.DefaultTextFieldAction.NumberInputLimit());
        }else {
            owner.setDocument(new king.flow.action.DefaultTextFieldAction.LengthInputLimit());
        }
    
    if (!(editable)) {
        owner.setEnabled(editable);
    }
}