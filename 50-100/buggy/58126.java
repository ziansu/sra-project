public void mailOfferReady(org.socialhistoryservices.delivery.reproduction.entity.Reproduction reproduction) throws org.springframework.mail.MailException {
    assert (reproduction.getStatus()) == (Reproduction.Status.HAS_ORDER_DETAILS) : "Can only mail order ready when Reproduction status is HAS_ORDER_DETAILS";
    java.lang.String subject = getMessage("reproductionMail.offerReadySubject", "Confirmation of reproduction - Your offer is ready");
    sendMail(reproduction, subject, "reproduction_offer_ready.mail.ftl", getReproductionModel(reproduction), reproduction.getRequestLocale());
}