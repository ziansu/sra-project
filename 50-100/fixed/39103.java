@java.lang.Override
public boolean run(int times) {
    if (com.skelril.skree.service.internal.shutdown.ShutdownServiceImpl.filter.matchesFilter(times)) {
        server.broadcastMessage(org.spongepowered.api.text.Texts.builder((((("Sever shutting down in " + times) + " seconds - for ") + (reopenDate)) + ".")).color(TextColors.RED).build());
    }
    return true;
}