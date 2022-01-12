private void prepareApplicationThreadLocal(javax.servlet.http.HttpSession session, javax.servlet.http.HttpServletRequest request) {
    org.egov.infra.config.core.ApplicationThreadLocals.setCityCode(((java.lang.String) (session.getAttribute(org.egov.infra.utils.ApplicationConstant.CITY_CODE_KEY))));
    org.egov.infra.config.core.ApplicationThreadLocals.setCityName(((java.lang.String) (session.getAttribute(org.egov.infra.utils.ApplicationConstant.CITY_NAME_KEY))));
    org.egov.infra.config.core.ApplicationThreadLocals.setMunicipalityName(((java.lang.String) (session.getAttribute(org.egov.infra.utils.ApplicationConstant.CITY_CORP_NAME_KEY))));
    org.egov.infra.config.core.ApplicationThreadLocals.setUserId(getUserIdFromAuthentication(session));
}