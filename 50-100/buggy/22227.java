@butterknife.OnClick(value = R.id.etBirthDate)
public void showDatePicker() {
    new android.app.DatePickerDialog(this.getContext(), dateSetListener, ((user.getBirthdate().getYear()) + 1900), user.getBirthdate().getMonth(), user.getBirthdate().getDate()).show();
}