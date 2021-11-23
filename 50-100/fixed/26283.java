@org.junit.Test
@org.jboss.arquillian.junit.InSequence(value = 2)
public void unsetDecrementerProperty() {
    org.jboss.hal.testsuite.fragment.ConfigFragment editPanelFragment = jcaPage.getConfigFragment();
    editPanelFragment.getEditor().text("capacity-decrementer-properties", "");
    boolean finished = editPanelFragment.save();
    org.junit.Assert.assertTrue("Config should be saved and closed.", finished);
    verifier.verifyAttribute(address, "capacity-decrementer-properties", "undefined");
}