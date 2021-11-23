boolean removePage(int pageNum) {
    throwIfOutOfBounds(pageNum);
    if (!(queryer.execute(storyboarder.Projects.deletePageSql(pageNum)))) {
        return false;
    }
    return queryer.execute(storyboarder.Projects.updateNumsSql(pageNum, ((getPageCount()) + 1)));
}