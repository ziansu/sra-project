public boolean isCommonAdmin() {
    cn.edu.upc.yb.integrate.common.dto.YibanBasicUserInfo user = ((cn.edu.upc.yb.integrate.common.dto.YibanBasicUserInfo) (httpSession.getAttribute("user")));
    int Yibanid = user.visit_user.userid;
    java.util.Collection<cn.edu.upc.yb.integrate.common.model.CommonAdmin> commonAdmins = ((java.util.Collection<cn.edu.upc.yb.integrate.common.model.CommonAdmin>) (commonAdminDao.findByYibanid(Yibanid)));
    if (commonAdmins.isEmpty()) {
        return false;
    }else {
        return true;
    }
}