protected void checkBillBasePrintNoNoStr(gov.nysenate.openleg.client.view.bill.BillView reference, gov.nysenate.openleg.client.view.bill.BillView content, gov.nysenate.openleg.model.spotcheck.SpotCheckObservation<gov.nysenate.openleg.model.bill.BaseBillId> obsrv) {
    if (!(stringEquals(content.getBasePrintNoStr(), reference.getBasePrintNoStr(), false, true)))
        obsrv.addMismatch(new gov.nysenate.openleg.model.spotcheck.SpotCheckMismatch(BILL_BASE_PRINT_NO_NoStr_OPENLEG_DEV, content.getBasePrintNoStr(), reference.getBasePrintNoStr()));
    
}