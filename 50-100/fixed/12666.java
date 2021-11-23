public static java.lang.String getShortDomain(orca.manage.beans.ReservationMng mng) {
    java.util.Properties resProps = orca.manage.OrcaConverter.fill(mng.getResourceProperties());
    java.lang.String domain = resProps.getProperty(orca.controllers.xmlrpc.XmlrpcHandlerHelper.RESOURCE_DOMAIN_VALUE);
    if (domain == null)
        return null;
    
    java.util.regex.Matcher matcher = orca.controllers.xmlrpc.XmlrpcHandlerHelper.pattern.matcher(domain);
    if (matcher.find())
        return matcher.group(1);
    else
        return null;
    
}