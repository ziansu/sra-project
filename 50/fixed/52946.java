public models.Correction addCorrection(java.lang.String name, java.lang.String description) {
    models.Correction action = new models.Correction(name, description, this);
    action.save();
    this.corrections.add(action);
    this.save();
    return action;
}