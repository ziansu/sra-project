@org.junit.Test
@org.jboss.arquillian.junit.InSequence(value = 3)
public void unsetDecrementerClass() {
    org.jboss.hal.testsuite.fragment.ConfigFragment editPanelFragment = jcaPage.getConfigFragment();
    editPanelFragment.getEditor().select("capacity-decrementer-class", "");
    boolean finished = editPanelFragment.save();
    org.junit.Assert.assertTrue("Config should be saved and closed.", finished);
    verifier.verifyAttribute(address, "capacity-decrementer-class", "undefined");
}