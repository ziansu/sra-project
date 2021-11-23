@java.lang.Override
public void onClick(android.view.View v) {
    tmpPrice = ((double) (pricePicker.getValue()));
    tmpLiter = ((double) (literPicker.getValue()));
    tmpDrivenKm = ((double) (drivenKmPicker.getValue()));
    try {
        download();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    dialog.dismiss();
}