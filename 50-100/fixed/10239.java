@java.lang.Override
public void run() {
    if (((org.bukkit.Bukkit.getOnlinePlayers().size()) != 0) && (isRecording)) {
        synchronized(currentFrame) {
            if (changed) {
                try {
                    synchronized(currentFrame) {
                        plugin.getFileManager().appendFrame(currentFrame);
                    }
                } catch (java.io.IOException e) {
                }
            }
            plugin.addTick();
            currentFrame = new de.sebpas.replay.filesystem.Frame(plugin.getHandledTicks());
            changed = false;
        }
    }
}