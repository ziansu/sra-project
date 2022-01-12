public void setArenaClass(final net.slipcor.pvparena.arena.ArenaClass aClass) {
    final net.slipcor.pvparena.events.PAPlayerClassChangeEvent event = new net.slipcor.pvparena.events.PAPlayerClassChangeEvent(arena, get(), aClass);
    org.bukkit.Bukkit.getServer().getPluginManager().callEvent(event);
    this.aClass = event.getArenaClass();
    if ((arena) != null) {
        net.slipcor.pvparena.loadables.ArenaModuleManager.parseClassChange(arena, get(), this.aClass);
    }
}