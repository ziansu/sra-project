private void fillSchoolInfo(background.School sch) {
    schUniNameText.setText(sch.getUniName());
    schDeptNameText.setText(sch.getDepartment());
    if ((sch.getGrade()) != 0)
        schGradeText.setText(java.lang.Integer.toString(sch.getGrade()));
    
}