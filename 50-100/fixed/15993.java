private void fillSchoolInfo(background.School sch) {
    schUniNameText.setText(sch.getUniName());
    if ((sch.getGrade()) != 0)
        schGradeText.setText(java.lang.Integer.toString(sch.getGrade()));
    else
        schGradeText.setText(null);
    
    schDeptNameText.setText(sch.getDepartment());
}