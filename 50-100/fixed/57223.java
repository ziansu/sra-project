public java.lang.String deleteCard() {
    if ((selectedCard) != null) {
        if (selectedCard.isDestroy()) {
            selectedCard.setDestroy(false);
        }else {
            selectedCard.setDestroy(true);
        }
        cardService.updateCard(selectedCard);
        selectedCard = new entities.CreditCard();
        return "listAccountTransaction?faces-redirect=true";
    }
    javax.faces.context.FacesContext.getCurrentInstance().addMessage(null, new javax.faces.application.FacesMessage(javax.faces.application.FacesMessage.SEVERITY_INFO, "Hiba!", "Kérem válassza ki a zárolni / aktiválni kívánt bankkártyát"));
    return "listAccountTransaction?faces-redirect=true";
}