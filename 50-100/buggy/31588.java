private void checkAmendment(gov.nysenate.openleg.model.bill.Bill bill, gov.nysenate.openleg.model.spotcheck.billtext.BillTextReference reference, gov.nysenate.openleg.service.spotcheck.billtext.SpotCheckObservation<gov.nysenate.openleg.model.bill.BaseBillId> obsrv) {
    if (((bill.getActiveVersion()) == null) || (!(bill.getActiveVersion().equals(reference.getActiveVersion())))) {
        obsrv.addMismatch(new gov.nysenate.openleg.service.spotcheck.billtext.SpotCheckMismatch(BILL_ACTIVE_AMENDMENT, reference.getActiveVersion(), bill.getActiveAmendment()));
    }
}