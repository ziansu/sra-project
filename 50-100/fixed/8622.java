@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.afegeix :
            calcul_data();
            break;
        case R.id.dataInit :
            fromDatePickerDialog.show();
            break;
        case R.id.dataFi :
            toDatePickerDialog.show();
            break;
    }
}