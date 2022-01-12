@org.junit.Test
public void testRemoveCommunity() throws java.lang.Exception {
    es.upc.fib.prop.usParlament.domain.Congress congress = prepareCurrentCongress();
    java.util.List<java.util.Set<es.upc.fib.prop.usParlament.domain.MP>> partition = prepareMainPartition();
    int size = partition.size();
    java.util.Set<es.upc.fib.prop.usParlament.domain.MP> toRemove = partition.get(1);
    controller.removeCommunity("1");
    assertEquals((size - 1), controller.getMainPartition().size());
    assertFalse(controller.getMainPartition().contains(toRemove));
}