private beans.Utente transform(org.telegram.telegrambots.api.objects.User utente, long chatId) {
    beans.Utente utenteCustom = new beans.Utente();
    utenteCustom.setChatId(chatId);
    utenteCustom.setId(utente.getId());
    utenteCustom.setCognome(utente.getLastName());
    utenteCustom.setName(utente.getFirstName());
    utenteCustom.setUsername(utente.getUserName());
    return utenteCustom;
}