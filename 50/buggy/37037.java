public fr.istic.iodeman.builder.PlanningExportBuilder validate() {
    this.validator.configure(planning, participants, timeboxes);
    this.validate();
    return this;
}