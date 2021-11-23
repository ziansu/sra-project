public <T> java.util.List<T> getPage(java.util.List<T> args, int page) {
    return args.subList((page < 1 ? 0 : (page * (getPageCount())) - (getPageCount())), ((args.size()) < (page * (getPageCount())) ? args.size() : page * (getPageCount())));
}