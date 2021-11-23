private void writeActiveModsToFile(@org.jetbrains.annotations.NotNull
com.sdoras.mods.manager.core.ModManager modManager) {
    try (java.io.BufferedWriter output = new java.io.BufferedWriter(new java.io.FileWriter(mTrackingFile, false))) {
        for (com.sdoras.mods.manager.core.Mod mod : modManager.getManagedMods()) {
            if (modManager.isModActive(mod)) {
                output.write(java.lang.String.format("%s%n", mod.getName()));
            }
        }
    } catch (java.io.IOException e) {
    }
}