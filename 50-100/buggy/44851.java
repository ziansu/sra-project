private edu.mit.coeus.utils.xml.v2.propdev.PROPINVESTIGATORTYPE getProposalInvestigatorXMLObject(java.util.List<org.kuali.kra.proposaldevelopment.printing.xmlstream.ProposalPerson> proposalPersonList) {
    edu.mit.coeus.utils.xml.v2.propdev.PROPINVESTIGATORTYPE propInvestigatorType = PROPINVESTIGATORTYPE.Factory.newInstance();
    org.kuali.kra.proposaldevelopment.printing.xmlstream.KcPerson person = getPrincipalInvetigatorPerson(proposalPersonList);
    if (person != null) {
        propInvestigatorType.setPERSONNAME(getPersonNameAndInfo(person));
    }
    if ((person.getFullName()) != null) {
        propInvestigatorType.setPERSONID(person.getFullName());
    }
    return propInvestigatorType;
}