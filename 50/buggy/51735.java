public int getTotalPage(int pageSize) {
    int totalPage = countRs();
    return (totalPage % pageSize) == 0 ? totalPage / pageSize : (totalPage / pageSize) + 1;
}