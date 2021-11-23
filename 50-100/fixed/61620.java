public java.lang.String getUserPageInLeaderBoard(long testId, java.lang.String userName) throws com.bionic.exceptions.ServerException {
    double userPositionInLeaderBoard = oneTimeTestDAO.countPositionInLeaderBoard(testId, userName);
    try {
        int page = ((int) (java.lang.Math.ceil((userPositionInLeaderBoard / (com.bionic.services.GuestService.getPageStackSize())))));
        return java.lang.String.valueOf(page);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}