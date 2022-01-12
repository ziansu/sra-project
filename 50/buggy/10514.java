@java.lang.Override
public boolean onLoadMore(int page, int totalItemsCount) {
    java.lang.System.out.println(page);
    bwRest.getRestClient(page, "load");
    return true;
}