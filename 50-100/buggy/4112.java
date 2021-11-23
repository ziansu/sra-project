@java.lang.Override
public void OnDialogDeleteClick(android.app.DialogFragment dialog) {
    sk.berops.android.vehiculum.dataModel.Car car = cars.get(getSelectedCarPosition());
    java.lang.System.out.println(("Removing car ID " + (getSelectedCarPosition())));
    cars.remove(car);
    try {
        MainActivity.dataHandler.saveGarage(MainActivity.garage);
    } catch (java.io.IOException ex) {
        android.util.Log.d("ERROR", ("Problem when saving changes: " + (ex.getMessage())));
    }
    adapter.notifyDataSetChanged();
}