public void removeShift(android.view.View v) {
    ca.mcgill.ecse321.foodtruck.controller.FoodTruckController ftc = new ca.mcgill.ecse321.foodtruck.controller.FoodTruckController();
    android.widget.Spinner scheduleSpinner = ((android.widget.Spinner) (findViewById(R.id.shiftSpinner)));
    ca.mcgill.ecse321.foodtruck.model.Shift selectedShift = this.shifts.get(scheduleSpinner.getSelectedItemPosition());
    try {
        ftc.cancelShift(lastSelectedEmployee, selectedShift);
    } catch (ca.mcgill.ecse321.foodtruck.controller.InvalidInputException e) {
        errorRemoveShift = e.getMessage();
    }
    refreshData();
}