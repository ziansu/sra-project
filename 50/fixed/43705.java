public int getTotalPages(int pageSize, int allRows) {
    int totalPage = ((allRows % pageSize) == 0) ? allRows / pageSize : (allRows / pageSize) + 1;
    if (allRows == 0)
        totalPage = 1;
    
    return totalPage;
}