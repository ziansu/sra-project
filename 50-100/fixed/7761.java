private java.util.Collection<java.lang.String> queryAllDomains() {
    com.dianping.cat.report.service.ModelRequest request = new com.dianping.cat.report.service.ModelRequest(com.dianping.cat.Constants.CAT, ModelPeriod.CURRENT.getStartTime());
    if (m_service.isEligable(request)) {
        com.dianping.cat.report.service.ModelResponse<com.dianping.cat.consumer.dependency.model.entity.DependencyReport> response = m_service.invoke(request);
        com.dianping.cat.consumer.dependency.model.entity.DependencyReport report = response.getModel();
        if (null != report) {
            return report.getDomainNames();
        }
    }
    return new java.util.HashSet<java.lang.String>();
}