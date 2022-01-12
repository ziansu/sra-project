public void sendOrder(serie.trame.Order o) throws java.lang.InterruptedException {
    serie.trame.Conversation f = getNextAvailableConversation();
    f.update(o);
    if (debugSerie)
        log.debug(("Envoi d'une nouvelle trame : " + (f.getFirstTrame())));
    
    serieOutput.add(f.getFirstTrame().trame, f.getFirstTrame().tailleTrame);
    f.updateResendDate();
}