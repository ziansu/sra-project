public void onRadioButtonClicked(android.view.View view) {
    boolean checked = ((android.widget.RadioButton) (view)).isChecked();
    switch (view.getId()) {
        case R.id.add_bill_status_paid :
            if (checked)
                paid = true;
            
            break;
        case R.id.add_bill_status_unpaid :
            if (checked)
                paid = false;
            
            break;
    }
}