public void read(nl.sjtek.sjtekcontrol.network.Arguments arguments) {
    for (nl.sjtek.sjtekcontrol.settings.User user : nl.sjtek.sjtekcontrol.settings.User.values()) {
        for (java.lang.String cardId : user.getNFCTags()) {
            if (cardId.equals(arguments.getCardId()))
                doStuff(user);
            
        }
    }
}