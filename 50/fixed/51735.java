public int getTotalPage(int pageSize) {
    int totalPage = countRs();
    if (pageSize > totalPage)
        return 1;
    
    return (totalPage % pageSize) == 0 ? totalPage / pageSize : (totalPage / pageSize) + 1;
}