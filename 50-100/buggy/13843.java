@org.junit.Test
public void testAddList_2args_1() {
    java.lang.System.out.println("addList");
    java.lang.Object nameOrIndex = "list";
    java.lang.Object[] values = new java.lang.Object[]{ "1" , "2" };
    frank_json.JSON instance = object;
    instance.addList(nameOrIndex, values);
    java.util.ArrayList listr = new java.util.ArrayList();
    listr.add("1");
    listr.add("2");
    assertEquals(listr, instance.getList(0));
}