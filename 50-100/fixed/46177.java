@org.testng.annotations.Test
public void testRenderError() {
    java.lang.String message = "jöksdifuwe9823hkldhf";
    wicketTester.getSession().getFeedbackMessages().error(null, message);
    wicketTester.startComponentInPage(new de.flower.rmt.ui.common.form.FormFeedbackPanel(null));
    wicketTester.dumpComponentWithPage();
    wicketTester.assertVisible("hasErrors");
    wicketTester.assertContains(message);
}