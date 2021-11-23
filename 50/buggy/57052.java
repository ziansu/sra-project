public com.fh.util.PageData listDetail(int id) throws java.lang.Exception {
    return ((com.fh.util.PageData) (dao.findForObject("WarehouseMapper.getOrdersDetail", id)));
}