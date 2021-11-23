void setAllRecipients() {
    for (int i = 0; i < ((numSantasInList) - 1); i++) {
        santasList.get(i).setRecipient(santasList.get((i + 1)));
    }
    santasList.get(((numSantasInList) - 1)).setRecipient(santasList.get(0));
}