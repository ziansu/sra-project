@org.junit.Test
@org.jboss.arquillian.junit.InSequence(value = 4)
public void setIncrementerClass() {
    org.jboss.hal.testsuite.fragment.ConfigFragment editPanelFragment = jcaPage.getConfigFragment();
    editPanelFragment.getEditor().select("capacityIncrementerClass", "org.jboss.jca.core.connectionmanager.pool.capacity.SizeIncrementer");
    boolean finished = editPanelFragment.save();
    org.junit.Assert.assertTrue("Config should be saved and closed.", finished);
    verifier.verifyAttribute(address, "capacity-incrementer-class", "org.jboss.jca.core.connectionmanager.pool.capacity.SizeIncrementer");
}