@org.junit.Test
public void testQuery() throws java.lang.Exception {
    java.util.List<org.david.rain.dubbox.provider.entity.Task> list = taskMapper.getMemberListPage(new org.david.rain.dubbox.provider.dao.utils.EasyPageInfo(5, 3, "id", "id"));
    for (org.david.rain.dubbox.provider.entity.Task t : list) {
        java.lang.System.out.println(t);
    }
}