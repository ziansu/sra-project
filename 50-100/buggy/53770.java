public io.github.davidg95.equestricraftplugin.MyHorse getHorse(java.util.UUID uuid) {
    for (io.github.davidg95.equestricraftplugin.MyHorse h : horses) {
        if ((h == null) || ((h.getUuid()) == null)) {
            continue;
        }
        if (((h.getUuid()) != null) && (h.getUuid().equals(uuid))) {
            return h;
        }
    }
    return null;
}