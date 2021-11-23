private com.liteon.icampusguardian.util.JSONResponse.Student createChild() {
    com.liteon.icampusguardian.util.JSONResponse.Student student = new com.liteon.icampusguardian.util.JSONResponse.Student();
    student.setDob("2000-01-01");
    student.setName("");
    student.setGender(getString(R.string.setup_kid_male));
    student.setHeight(0);
    student.setWeight(0);
    return student;
}