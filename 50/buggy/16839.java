public double getMaxScorePercentage(sourcePackage.Database base, java.sql.Connection connection) {
    return base.getUserMaxScore(this.userName, connection);
}