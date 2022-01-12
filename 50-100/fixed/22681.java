public void setDone(java.lang.Integer aProcessID) throws java.sql.SQLException {
    try (com.compomics.pladipus.core.control.distribution.service.database.AutoCloseableDBConnection c = new com.compomics.pladipus.core.control.distribution.service.database.AutoCloseableDBConnection(false);java.sql.PreparedStatement updateRun = c.prepareStatement("UPDATE process SET complete = ? WHERE process_id=?")) {
        updateRun.setBoolean(1, true);
        updateRun.setInt(2, aProcessID);
        updateRun.executeUpdate();
        c.commit();
    }
}