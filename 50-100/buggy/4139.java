public void send() {
    if (isFormValid()) {
        try {
            com.sipe.utils.Utils.sendEmail(email, null, (((com.sipe.utils.Constantes.ADRESSE_INFO) + ", ") + (com.sipe.utils.Constantes.ADRESSE_WEBSITE)), "[SIPE] Prise de contact", getContent(), true, null);
            disabled = true;
            setFormFeedback(FEEDBACK_FORMULAIRE_ENVOYE);
        } catch (java.lang.Exception e) {
            com.sipe.utils.Utils.printStackTrace(e, null);
            setFormFeedback(FEEDBACK_ENVOI_ECHEC);
        }
    }
}