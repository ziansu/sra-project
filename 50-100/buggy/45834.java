@java.lang.Override
public gov.aps.jca.cas.ProcessVariableExistanceCompletion processVariableExistanceTest(java.lang.String aliasName, java.net.InetSocketAddress clientAddress, gov.aps.jca.cas.ProcessVariableExistanceCallback asyncCompletionCallback) throws gov.aps.jca.CAException, java.lang.IllegalArgumentException, java.lang.IllegalStateException {
    gov.aps.jca.cas.ProcessVariableExistanceCompletion result = gov.aps.jca.cas.ProcessVariableExistanceCompletion.DOES_NOT_EXIST_HERE;
    if (containsPV(aliasName)) {
        result = gov.aps.jca.cas.ProcessVariableExistanceCompletion.EXISTS_HERE;
        org.csstudio.application.weightrequest.server.CaServer.LOG.info("{}, {}: EXISTS HERE", aliasName, clientAddress.toString());
    }else {
        if (org.csstudio.application.weightrequest.server.CaServer.LOG.isDebugEnabled()) {
            org.csstudio.application.weightrequest.server.CaServer.LOG.debug("{}, {}: does not exist", aliasName, clientAddress.toString());
        }
    }
    return result;
}