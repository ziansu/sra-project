@java.lang.Override
public void run() {
    final org.bukkit.entity.Horse h = ((org.bukkit.entity.Horse) (e));
    final io.github.davidg95.equestricraftplugin.MyHorse mh = io.github.davidg95.equestricraftplugin.MyHorse.horseToMyHorse(h);
    container.cacheHorse(mh);
}