public java.lang.String getUserCount(cn.springmvc.model.VoucherModel vmodel, cn.springmvc.model.BasicModel model) {
    return voucherDao.getUserCount(vmodel.getFilter());
}