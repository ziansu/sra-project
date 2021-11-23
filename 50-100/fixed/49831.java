public static void createTrain(trains.Train train) throws java.sql.SQLException {
    java.sql.PreparedStatement statement = trains.Database.connection.prepareStatement(trains.Database.createTrain);
    statement.setString(1, train.getName());
    if ((statement.executeUpdate()) > 0) {
    }else {
        throw statement.getWarnings();
    }
}