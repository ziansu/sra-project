@java.lang.Override
public void onClick(android.view.View view) {
    if (chkOption2.isChecked()) {
        chkOption2.setChecked(false);
    }
    settings_dao.updateGpaCalcOperation(user_index, "0");
    com.a14roxgmail.prasanna.mobileapp.Algorithm.GPA1 gpa1 = new com.a14roxgmail.prasanna.mobileapp.Algorithm.GPA1(getContext(), new com.a14roxgmail.prasanna.mobileapp.DAO.GradeDAO(getContext()), user_index);
    gpa1.calculate();
}