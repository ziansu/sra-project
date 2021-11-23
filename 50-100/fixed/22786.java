public int getTotalPage(int pageSize, java.lang.String datetime) {
    int totalPage = countRs(datetime);
    if (pageSize > totalPage)
        return 1;
    
    return (totalPage % pageSize) == 0 ? totalPage / pageSize : (totalPage / pageSize) + 1;
}