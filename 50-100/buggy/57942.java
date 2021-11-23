@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    com.mdlive.unifiedmiddleware.commonclasses.utils.MdliveUtils.hideSoftKeyboard(this);
    if (checkedId == (R.id.birthComplications_yesButton)) {
        updateBirthComplication("Birth complications", "Yes");
        edtBirthComplications.setVisibility(View.VISIBLE);
        updateBirthComplication("Birth complications explanation", edtBirthComplications.getText().toString());
        enableSaveButton();
    }else {
        updateBirthComplication("Birth complications", "No");
        edtBirthComplications.setVisibility(View.GONE);
        updateBirthComplication("Birth complications explanation", "");
        enableSaveButton();
    }
}