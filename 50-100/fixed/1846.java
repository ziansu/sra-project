@org.junit.Test
public void saveItem() {
    com.flectosystems.extspark.model.Item item = new com.flectosystems.extspark.model.Item();
    item.setItem("ItemTest");
    item.setDesc("Description");
    item.setStatus("Available");
    item.setWeight(2.34);
    com.flectosystems.extspark.test.PersistenceTest.itemDao.addItem(item);
    com.flectosystems.extspark.model.Item savedItem = com.flectosystems.extspark.test.PersistenceTest.itemDao.getItem("ItemTest");
    junit.framework.TestCase.assertTrue("Must match", ((item.getWeight()) == (savedItem.getWeight())));
}