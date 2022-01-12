private void refreshMailboxViewers(no.runsafe.framework.api.player.IPlayer owner) {
    for (java.util.Map.Entry<no.runsafe.framework.api.player.IPlayer, no.runsafe.mailbox.MailView> openMailbox : this.openMailboxes.entrySet())
        if (openMailbox.getKey().equals(owner))
            this.refreshMailbox(openMailbox.getValue().getViewer(), owner);
        
    
}