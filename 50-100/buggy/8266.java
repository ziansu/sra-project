public void openMailSender(no.runsafe.framework.api.player.IPlayer sender, no.runsafe.framework.api.player.IPlayer recipient) {
    sender.sendColouredMessage((("&3Sending mail will cost " + (this.getMailCostText())) + "."));
    no.runsafe.framework.minecraft.inventory.RunsafeInventory inventory = server.createInventory(null, 54, ("Mail to " + (recipient.getName())));
    this.openSendAgents.put(sender.getName(), new no.runsafe.mailbox.MailSendAgent(recipient, inventory));
    sender.openInventory(inventory);
}