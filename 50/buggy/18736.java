@org.junit.Test(expected = org.yj.smtpstub.exception.IncompleteEmailException.class)
public void testSaveIncomplete2() throws org.yj.smtpstub.exception.IncompleteEmailException {
    org.yj.smtpstub.model.EmailModel model = new org.yj.smtpstub.model.EmailModel();
    model.setEmailStr("not empty string");
    store.save(model);
}