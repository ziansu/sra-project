protected void displayUUIDError(net.minecraft.command.ICommandSender sender, crowsofwar.gorecore.command.GoreCoreMultiCommand.Subcommand using, java.lang.String player, crowsofwar.gorecore.util.GoreCorePlayerUUIDs.ResultOutcome error) {
    switch (error) {
        case SUCCESS :
            {
                break;
            }
        case USERNAME_DOES_NOT_EXIST :
            {
                displayErrorPlayerDoesntExist(sender, using, player);
                break;
            }
        case BAD_HTTP_CODE :
        case EXCEPTION_OCCURED :
            {
                displayErrorGetUUIDError(sender, using, player);
                break;
            }
    }
}