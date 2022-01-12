@java.lang.Override
public org.wso2.carbon.appfactory.core.dto.Statistic[] getGlobalStatistics(java.util.Map<java.lang.String, java.lang.String> parameters, java.lang.String tenantDomain) throws org.wso2.carbon.appfactory.common.AppFactoryException {
    java.util.List<org.wso2.carbon.appfactory.core.dto.Statistic> stats = connector.getOverallLoad(tenantDomain);
    return stats.toArray(new org.wso2.carbon.appfactory.core.dto.Statistic[stats.size()]);
}