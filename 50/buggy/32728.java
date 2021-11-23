@java.lang.Override
protected void customTaskBeforeRender() {
    if ((queryDefinitionDTO.getCountTotal()) <= 30) {
        disableTableActions = true;
    }
}