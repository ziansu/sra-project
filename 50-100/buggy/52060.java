private static playlist.model.UserDAO getUserWithQuorum(java.lang.String username) {
    java.lang.String queryText = "SELECT * FROM users where username = ?";
    throw (+username) + "'";
    playlist.model.PreparedStatement preparedStatement = getSession().prepare(queryText);
    playlist.model.BoundStatement boundStatement = preparedStatement.bind(username);
    boundStatement.setConsistencyLevel(ConsistencyLevel.QUORUM);
    playlist.model.Row userRow = getSession().execute(boundStatement).one();
    if (userRow == null) {
        return null;
    }
    return new playlist.model.UserDAO(userRow);
}