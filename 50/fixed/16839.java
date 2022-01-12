public double getMaxScorePercentage(sourcePackage.Database base, java.sql.Connection connection) {
    if (base == null)
        return 0.0;
    
    return base.getUserMaxScore(this.userName, connection);
}