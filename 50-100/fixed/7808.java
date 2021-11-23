@org.junit.Test
public void matchComparationTest() {
    final org.opendaylight.openflowplugin.applications.statistics.manager.impl.helper.SimpleComparator<org.opendaylight.yang.gen.v1.urn.opendaylight.flow.types.rev131026.Flow> simpleComparator = org.opendaylight.openflowplugin.applications.statistics.manager.impl.helper.FlowComparatorFactory.createMatch();
    compareViaComparator(simpleComparator);
    org.junit.Assert.assertEquals(false, simpleComparator.areObjectsEqual(org.opendaylight.openflowplugin.applications.statistics.manager.impl.helper.FlowComparatorFactoryTest.nullFlow, org.opendaylight.openflowplugin.applications.statistics.manager.impl.helper.FlowComparatorFactoryTest.storedFlow));
    org.junit.Assert.assertEquals(true, simpleComparator.areObjectsEqual(org.opendaylight.openflowplugin.applications.statistics.manager.impl.helper.FlowComparatorFactoryTest.statsFlow, org.opendaylight.openflowplugin.applications.statistics.manager.impl.helper.FlowComparatorFactoryTest.copyStatsFlow));
    org.junit.Assert.assertEquals(false, simpleComparator.areObjectsEqual(org.opendaylight.openflowplugin.applications.statistics.manager.impl.helper.FlowComparatorFactoryTest.statsFlow, org.opendaylight.openflowplugin.applications.statistics.manager.impl.helper.FlowComparatorFactoryTest.nullFlow));
}