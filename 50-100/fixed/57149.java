@java.lang.Override
public void onClick(android.view.View view) {
    if (chkOption1.isChecked()) {
        chkOption1.setChecked(false);
    }
    settings_dao.updateGpaCalcOperation(user_index, "1");
    com.a14roxgmail.prasanna.mobileapp.Algorithm.GPA2 gpa2 = new com.a14roxgmail.prasanna.mobileapp.Algorithm.GPA2(getContext(), new com.a14roxgmail.prasanna.mobileapp.DAO.GradeDAO(getContext()), user_index);
    gpa2.calculate();
}