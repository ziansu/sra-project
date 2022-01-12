@java.lang.Override
public void setParameters(org.wso2.carbon.gateway.core.config.ParameterHolder parameterHolder) {
    logMessage = parameterHolder.getParameter("parameters").getValue();
}