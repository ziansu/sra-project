public java.util.List<com.exmertec.yaz.model.User> queryList() {
    return with(field(userName).like(notLike)).queryList();
}