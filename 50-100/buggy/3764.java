public java.lang.String createPlan() {
    int retVal = BusinessLogic.Controller.PlansController.createPlan(agencyNumber, name, price, startDate, finishDate);
    if (retVal == (Util.Constants.SUCCESS)) {
        this.message = "Plan created succesfully!";
        return "";
    }
    this.message = "Plan could not be created!";
    return "";
}