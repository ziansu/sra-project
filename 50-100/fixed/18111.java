protected int parsePresence(org.awesomeapp.messenger.model.Presence presence) {
    int type = org.awesomeapp.messenger.model.Presence.AVAILABLE;
    org.awesomeapp.messenger.model.Presence.Mode rmode = presence.getMode();
    org.awesomeapp.messenger.model.Presence.Type rtype = presence.getType();
    if ((rmode == org.awesomeapp.messenger.plugin.xmpp.org.jivesoftware.smack.packet.Presence.Mode) || (rmode == org.awesomeapp.messenger.plugin.xmpp.org.jivesoftware.smack.packet.Presence.Mode))
        type = org.awesomeapp.messenger.model.Presence.AWAY;
    else
        if (rmode == org.awesomeapp.messenger.plugin.xmpp.org.jivesoftware.smack.packet.Presence.Mode)
            type = org.awesomeapp.messenger.model.Presence.DO_NOT_DISTURB;
        else
            if (rtype == org.awesomeapp.messenger.plugin.xmpp.org.jivesoftware.smack.packet.Presence.Type)
                type = org.awesomeapp.messenger.model.Presence.OFFLINE;
            else
                if (rtype == org.awesomeapp.messenger.plugin.xmpp.org.jivesoftware.smack.packet.Presence.Type)
                    type = org.awesomeapp.messenger.model.Presence.OFFLINE;
                
            
        
    
    return type;
}