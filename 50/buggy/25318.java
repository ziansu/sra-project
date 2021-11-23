public void clearArguments() {
    for (final org.apache.isis.viewer.wicket.model.models.ActionArgumentModel actionArgumentModel : arguments.values()) {
        actionArgumentModel.reset();
    }
    this.actionMode = org.apache.isis.viewer.wicket.model.models.ActionModel.determineMode(actionMemento.getAction(getSpecificationLoader()));
}