public java.lang.String processDisapprove() throws com.liferay.portal.kernel.exception.PortalException, com.liferay.portal.kernel.exception.SystemException {
    getControllerApproveTDW().disapprove();
    if ((getTransMst().getStatus()) != null) {
        getForApproveSingle().setForApproveTDW(null);
        getTransMst().setStatus(null);
        return "";
    }else {
        initData();
        return "success";
    }
}