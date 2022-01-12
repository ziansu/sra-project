@org.testng.annotations.Test
public void verifyCopy_terms_dwh_public_notR() throws java.lang.InterruptedException {
    goTo_step4("DWH", rpID.Full(), true, false, false);
    org.junit.Assert.assertEquals(step4.verify_termsCopy_new(environment, "DWH", rpID.Full(), false, false, false, wd, false), true);
}