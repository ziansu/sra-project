@org.junit.Test
public void addSqlTaskTest() {
    com.shinemo.mydb.meta.domain.SqlTaskDO sqlTask = new com.shinemo.mydb.meta.domain.SqlTaskDO();
    sqlTask.setCreateUid(1L);
    sqlTask.setSql("select * from huang");
    sqlTask.setDbId(4L);
    sqlTask.setDbName("mydb");
    sqlTask.setCreateDesc("没事玩呢");
    sqlTask.setTaskStatusEnum(TaskStatusEnum.WAIT_APPROVE);
    sqlTaskDao.add(sqlTask);
    java.lang.System.out.println(sqlTask.getId());
}