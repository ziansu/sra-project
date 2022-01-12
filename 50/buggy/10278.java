public void reset() {
    this.actionMode = org.apache.isis.viewer.wicket.model.models.ActionModel.determineMode(actionMemento.getAction(getSpecificationLoader()));
}