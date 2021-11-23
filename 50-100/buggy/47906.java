public void updateLinesFromPartner(com.axelor.rpc.ActionRequest request, com.axelor.rpc.ActionResponse response) {
    com.axelor.apps.base.db.Partner partnerView = request.getContext().asType(com.axelor.apps.base.db.Partner.class);
    com.axelor.apps.base.db.Partner partner = partnerRepo.find(partnerView.getId());
    java.util.Map<java.lang.String, java.lang.Object> map = customerCreditLineService.updateLines(partner);
    response.setValues(map);
}