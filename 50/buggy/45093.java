@org.junit.Test
public void testSaveNominal() throws org.yj.smtpstub.exception.IncompleteEmailException {
    store.save(sampleEmail);
    assert true;
}