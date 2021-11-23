public void reveal(com.vintagetechnologies.menschaergeredichnicht.structure.Player possibleCheater, com.vintagetechnologies.menschaergeredichnicht.structure.Player revealer) {
    boolean hasCurrentPlayerCheated = possibleCheater.getSchummeln().hasCheated();
    possibleCheater.setHasToSkip(hasCurrentPlayerCheated);
    java.lang.String message;
    java.lang.String nameOfCurrentPlayer = possibleCheater.getName();
    java.lang.String nameOfRevealer = revealer.getName();
    if (hasCurrentPlayerCheated)
        message = ("Schummeln enttarnt! " + nameOfCurrentPlayer) + " setzt nächste Runde aus.";
    else
        message = nameOfRevealer + " hat falsch verdächtigt, und setzt nächste Runde aus!";
    
    com.vintagetechnologies.menschaergeredichnicht.synchronisation.GameSynchronisation.synchronize();
    com.vintagetechnologies.menschaergeredichnicht.synchronisation.GameSynchronisation.sendToast(message);
}