@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    boolean isClicable = !(s.toString().matches(" *"));
    if (isClicable) {
        wgtBtnAddNewMovie.setBackgroundTintList(getResources().getColorStateList(R.color.colorPrimary));
    }else {
        wgtBtnAddNewMovie.setBackgroundTintList(getResources().getColorStateList(R.color.gray));
    }
    wgtBtnAddNewMovie.setClickable(isClicable);
}