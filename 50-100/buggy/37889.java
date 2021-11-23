@org.testng.annotations.Test
public void verifyCopy_terms_dwh_private_notR() throws java.lang.InterruptedException {
    goTo_step4("DWH", rpID.private_Full(), false, true, false);
    org.junit.Assert.assertEquals(step4.verify_termsCopy_new(environment, "DWH", rpID.private_Full(), false, true, false, wd, false), true);
}