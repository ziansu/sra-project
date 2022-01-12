public java.util.List<cn.springmvc.model.UserParamModel> getUser(cn.springmvc.model.VoucherModel vmodel) throws java.lang.Exception {
    return voucherDao.getUser(vmodel.getFilter(), vmodel.getOrder(), vmodel.getOffset(), vmodel.getCount());
}