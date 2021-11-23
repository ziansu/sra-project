@java.lang.Override
protected void customTaskBeforeRender() {
    disableTableActions = (queryDefinitionDTO.getCountTotal()) <= 30;
}