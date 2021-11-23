private org.kuali.kfs.coreservice.framework.parameter.ParameterService getParameterService() {
    if ((parameterService) == null) {
        parameterService = org.kuali.kfs.sys.context.SpringContext.getBean(org.kuali.kfs.coreservice.framework.parameter.ParameterService.class);
    }
    return parameterService;
}