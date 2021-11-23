private void refreshMailboxViewers(no.runsafe.framework.api.player.IPlayer owner) {
    for (java.util.Map.Entry<java.lang.String, no.runsafe.mailbox.MailView> openMailbox : this.openMailboxes.entrySet())
        if (openMailbox.getKey().equals(owner.getName()))
            this.refreshMailbox(openMailbox.getValue().getViewer(), owner);
        
    
}