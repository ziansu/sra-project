public <T> java.util.List<T> getPage(java.util.List<T> args, int page) {
    return args.subList(((page * (getPageCount())) - (getPageCount())), ((args.size()) < (page * (getPageCount())) ? args.size() : page * (getPageCount())));
}