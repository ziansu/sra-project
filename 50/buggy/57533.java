@java.lang.Override
public java.util.List<org.nutz.ztask.api.Message> all(java.lang.String owner, java.lang.String keyword) {
    return list(owner, keyword, null, 0);
}