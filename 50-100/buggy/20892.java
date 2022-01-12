public void read(nl.sjtek.sjtekcontrol.network.Arguments arguments) {
    java.lang.String scannedCard = arguments.getCardId();
    for (nl.sjtek.sjtekcontrol.settings.User user : nl.sjtek.sjtekcontrol.settings.User.values()) {
        for (java.lang.String cardId : user.getNFCTags()) {
            if (cardId.equals(scannedCard))
                doStuff(user);
            
        }
    }
}