public void loadPost(edu.ycp.cs320.groupProject.model.Post p, java.sql.ResultSet resultSet, int index) throws java.sql.SQLException {
    p.setText(resultSet.getString((index++)));
    p.setSenderName(resultSet.getString((index++)));
    p.setRoomID(resultSet.getInt((index++)));
}