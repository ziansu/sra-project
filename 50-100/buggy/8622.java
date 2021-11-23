@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.afegeix :
            calcul_data();
            if (!(trobat)) {
                android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.example.marlen.ventaentrades_idi.llistaObres.class);
                startActivity(intent);
                finish();
            }
            break;
        case R.id.dataInit :
            fromDatePickerDialog.show();
            break;
        case R.id.dataFi :
            toDatePickerDialog.show();
            break;
    }
}