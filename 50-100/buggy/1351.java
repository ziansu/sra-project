private void sendResolveHealthcareWorkerIdentifierRequest(org.openhim.mediator.denormalization.ResolveHealthcareWorkerIdentifier msg) {
    java.lang.String csdTemplate = ((((((("<csd:careServicesRequest xmlns=\'urn:ihe:iti:csd:2013\' xmlns:csd=\'urn:ihe:iti:csd:2013\'>\n" + (("\t<function urn=\'urn:ihe:iti:csd:2014:stored-function:provider-search\'>\n" + "\t\t<requestParams>\n") + "			<otherID code='")) + (msg.getIdentifier())) + "' assigningAuthorityName='") + (msg.getIdentifier().getAssigningAuthority().getAssigningAuthorityId())) + "\'/>\n") + "\t\t</requestParams>\n") + "\t</function>\n") + "</csd:careServicesRequest>";
    sendCSDRequest(csdTemplate, msg);
}