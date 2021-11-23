public void createPlan() {
    int retVal = BusinessLogic.Controller.PlansController.createPlan(agencyNumber, name, price, startDate, finishDate);
    if (retVal == (Util.Constants.SUCCESS)) {
        this.message = "Plan created succesfully!";
    }else {
        this.message = "Plan could not be created!";
    }
}