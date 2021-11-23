public void remove(com.turlygazhy.entity.Task task) throws java.sql.SQLException {
    java.sql.PreparedStatement ps = connection.prepareStatement("DELETE FROM TYPE_OF_WORK_TEMPLATE WHERE ID = ?");
    ps.setInt(1, task.getId());
}