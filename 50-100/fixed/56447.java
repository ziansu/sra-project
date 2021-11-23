private void removeNonMatchingIssuer(java.util.List<org.dcm4chee.arc.patient.impl.Patient> list, org.dcm4che3.data.Issuer issuer) {
    if (issuer != null) {
        for (java.util.Iterator<org.dcm4chee.arc.patient.impl.Patient> it = list.iterator(); it.hasNext();) {
            org.dcm4chee.arc.patient.impl.IssuerEntity ie = it.next().getPatientID().getIssuer();
            if ((ie != null) && (!(ie.getIssuer().matches(issuer))))
                it.remove();
            
        }
    }
}