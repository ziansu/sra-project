@java.lang.Override
public void modWillDeactivate(@org.jetbrains.annotations.NotNull
com.sdoras.mods.manager.core.ModManager modManager, @org.jetbrains.annotations.NotNull
com.sdoras.mods.manager.core.Mod mod) {
    java.lang.System.out.println(java.lang.String.format("Mod '%s' deactivating...", mod.getModName()));
}