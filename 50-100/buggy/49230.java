public int getTotalPage(int pageSize, java.lang.String userID, java.lang.String datetime, java.lang.String gameid) {
    int totalPage = countRs(userID, datetime, gameid);
    return (totalPage % pageSize) == 0 ? totalPage / pageSize : (totalPage / pageSize) + 1;
}