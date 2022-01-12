public int getTotalPage(int pageSize, java.lang.String datetime, java.lang.String gameid) {
    int totalPage = countRs(datetime, gameid);
    if (pageSize > totalPage)
        return 1;
    
    return (totalPage % pageSize) == 0 ? totalPage / pageSize : (totalPage / pageSize) + 1;
}