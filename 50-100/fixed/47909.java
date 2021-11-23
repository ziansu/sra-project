public java.sql.ResultSet getNetworkByRegion(int today, java.lang.String region) throws java.sql.SQLException {
    this.psNetwork.clearParameters();
    this.psNetwork.setString(1, region);
    this.psNetwork.setInt(2, today);
    return this.psNetwork.executeQuery();
}