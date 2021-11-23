@com.tekkombud.application.controller.RequestMapping(value = "add-cv-to-offer/{id}", method = RequestMethod.PUT)
public void updateOffer(@com.tekkombud.application.controller.PathVariable(value = "id")
java.lang.Integer id, @com.tekkombud.application.controller.RequestBody
com.tekkombud.application.entity.CV cv) {
    com.tekkombud.application.entity.Offer offer = offerService.getById(java.lang.Long.valueOf(id));
    java.util.Set<com.tekkombud.application.entity.CV> cvList = offer.getCvList();
    cvList.add(cv);
    offerService.update(offer);
}