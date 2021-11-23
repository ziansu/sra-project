public java.util.Vector<cg.LotDataProvider> getHeldLots(int aAccountId, java.lang.String ticker, java.lang.String year) {
    java.util.Vector<cg.LotDataProvider> tHeldLots = new java.util.Vector<cg.LotDataProvider>();
    if ((_cm) != null) {
        java.sql.Connection tConn = _cm.getConnection();
        if (tConn != null) {
            tHeldLots = _dbi.getLotData(tConn, aAccountId);
            _cm.closeConnection(tConn);
        }
    }else {
    }
    return tHeldLots;
}