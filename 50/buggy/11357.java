public com.fh.util.PageData listDetail(java.lang.String id) throws java.lang.Exception {
    return ((com.fh.util.PageData) (dao.findForObject("WarehouseMapper.getOrdersDetail", id)));
}