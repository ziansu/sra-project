protected void checkAmendmentVersions(gov.nysenate.openleg.client.view.bill.BillView content, gov.nysenate.openleg.client.view.bill.BillView reference, gov.nysenate.openleg.model.spotcheck.SpotCheckObservation<gov.nysenate.openleg.model.bill.BaseBillId> obsrv) {
    java.lang.String content_str = serialize(content.getAmendmentVersions(), true);
    java.lang.String reference_str = serialize(reference.getAmendmentVersions(), true);
    if (!(content_str.equals(reference_str)))
        obsrv.addMismatch(new gov.nysenate.openleg.model.spotcheck.SpotCheckMismatch(BILL_AMENDMENT_VERSION_OPENLEG_DEV, content_str, reference_str));
    
}