public <T> T[] getPage(T[] args, int page) {
    return java.util.Arrays.copyOfRange(args, ((page * (getPageCount())) - (getPageCount())), (page * (getPageCount())));
}