public java.util.List<com.bionic.wrappers.NickMarkWrapper.NickMark> getLeaderBoard(long testId, long pageNumber, double pageStackSize) {
    javax.persistence.Query query = em.createNamedQuery("getLeaderBoard");
    query.setParameter("testId", testId);
    query.setParameter("pageNumber", pageNumber);
    query.setParameter("pageStackSize", pageStackSize);
    return ((java.util.List<com.bionic.wrappers.NickMarkWrapper.NickMark>) (query.getResultList()));
}