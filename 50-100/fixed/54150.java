public java.sql.ResultSet getNetworkByRegion(int today, java.lang.String region) throws java.sql.SQLException {
    this.psNetwork.clearParameters();
    this.psNetwork.setInt(1, today);
    this.psNetwork.setString(2, region);
    return this.psNetwork.executeQuery();
}