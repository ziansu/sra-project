public void run() {
    if (p.isOp()) {
        me.wirlie.allbanks.Translation.getAndSendMessage(p, StringsID.UPDATER_PLEASE_RELOAD_ALLBANKS, me.wirlie.allbanks.Translation.splitStringIntoReplaceHashMap(">>>", ("%1%>>>" + (me.wirlie.allbanks.AllBanks.getInstance().getDescription().getVersion()))), true);
    }
}