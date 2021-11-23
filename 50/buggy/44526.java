public com.jfinal.plugin.activerecord.Page<io.jpress.model.Content> doPaginateByModuleAndStatus(int page, int pagesize, java.lang.String module, java.lang.String status) {
    return doPaginate(pagesize, pagesize, module, status, 0, 0, null);
}