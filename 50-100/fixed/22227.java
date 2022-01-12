@butterknife.OnClick(value = R.id.etBirthDate)
public void showDatePicker() {
    java.util.Date date;
    if ((user.getBirthdate()) == null)
        date = new java.util.Date();
    else
        date = user.getBirthdate();
    
    new android.app.DatePickerDialog(this.getContext(), dateSetListener, ((date.getYear()) + 1900), date.getMonth(), date.getDate()).show();
}