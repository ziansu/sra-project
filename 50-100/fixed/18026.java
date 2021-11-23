private void merge(logic.Group addedGroup) {
    if (this.equals(addedGroup))
        return ;
    
    for (logic.Field aField : addedGroup.getFields()) {
        fields.add(aField);
        aField.setGroup(this);
    }
    breaths += (addedGroup.getBreaths()) - 2;
    if ((addedGroup.getBreaths()) == 1)
        (breaths)++;
    
    board.getGroups().remove(addedGroup);
}