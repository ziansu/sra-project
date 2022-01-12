public com.fh.util.PageData listDetail(com.fh.util.PageData id) throws java.lang.Exception {
    return ((com.fh.util.PageData) (dao.findForObject("WarehouseMapper.getOrdersDetail", id)));
}