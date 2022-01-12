public void setActionValue(java.lang.Object actionValue) {
    if (actionValue == null)
        return ;
    
    currentValue = actionValue;
    if (!(action.getValue().equals(actionValue)))
        this.action.setValue(actionValue);
    
    initChildList();
}