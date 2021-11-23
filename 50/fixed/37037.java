public fr.istic.iodeman.builder.PlanningExportBuilder validate() {
    this.validator.configure(planning, participants, timeboxes);
    this.validator.validate();
    return this;
}