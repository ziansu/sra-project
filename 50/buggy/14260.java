@java.lang.Override
public void unregisterAll() {
    com.github.tukenuke.tuske.manager.gui.v2.SkriptGUIEvent.getInstance().unregisterAll();
    org.bukkit.Bukkit.getScheduler().runTask(com.github.tukenuke.tuske.TuSKe.getInstance(), () -> ch.njol.skript.SkriptEventHandler.addSelfRegisteringTrigger(t));
}