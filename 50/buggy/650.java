@java.lang.Override
public void autoComplete(java.lang.String word, java.lang.String s1) {
    try {
        ClientCommandHandler.instance.autoComplete(word, s1);
    } catch (java.lang.Exception e) {
        mnm.mods.tabbychat.forge.ForgeCommandsImpl.logger.error(e);
    }
}