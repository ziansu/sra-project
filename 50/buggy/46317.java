@java.lang.Override
public java.lang.String[] getLatestAutoComplete() {
    java.lang.String[] result = new java.lang.String[0];
    try {
        return ClientCommandHandler.instance.latestAutoComplete;
    } catch (java.lang.Exception e) {
        mnm.mods.tabbychat.forge.ForgeCommandsImpl.logger.error(e);
    }
    return result;
}