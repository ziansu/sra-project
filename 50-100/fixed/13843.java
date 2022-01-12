@org.junit.Test
public void testAddList_2args_1() {
    java.lang.String nameOrIndex = "list";
    java.lang.Object[] values = new java.lang.Object[]{ "1" , "2" };
    object.addList(nameOrIndex, values);
    java.util.ArrayList listr = new java.util.ArrayList();
    listr.add("1");
    listr.add("2");
    assertEquals(listr, object.getList("list"));
}