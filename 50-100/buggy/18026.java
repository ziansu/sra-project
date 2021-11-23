private void merge(logic.Group addedGroup) {
    for (logic.Field aField : addedGroup.getFields()) {
        fields.add(aField);
        aField.setGroup(this);
    }
    breaths += (addedGroup.getBreaths()) - 2;
    if ((addedGroup.getBreaths()) == 1)
        (breaths)++;
    
    board.getGroups().remove(addedGroup);
}