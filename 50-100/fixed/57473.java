public java.lang.String processApprove() throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException, java.sql.SQLException {
    getControllerApproveTDW().approve();
    if ((getTransMst().getStatus()) != null) {
        getForApproveSingle().setForApproveTDW(null);
        getTransMst().setStatus(null);
        return "";
    }else {
        initData();
        return "success";
    }
}