public void remove(java.lang.Long id) {
    org.collectiveone.model.Cbtion cbtion = get(id);
    cbtion.setState(CbtionState.DELETED);
    cbtion.setDeleteDate(new java.sql.Timestamp(java.lang.System.currentTimeMillis()));
    if ((cbtion.getOpenDec()) != null)
        cbtion.getOpenDec().setState(DecisionState.CLOSED_EXTERNALLY);
    
    org.collectiveone.repositories.BidDao bidDao = new org.collectiveone.repositories.BidDao();
    for (org.collectiveone.model.Bid bid : cbtion.getBids()) {
        bidDao.remove(bid.getId());
    }
    save(cbtion);
}