@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.cancelBT :
            fragmentView.setVisibility(View.INVISIBLE);
            break;
        case R.id.okBT :
            activity.setDate(datePicker.getMonth(), datePicker.getDayOfMonth(), datePicker.getYear());
            fragmentView.setVisibility(View.INVISIBLE);
            break;
    }
}