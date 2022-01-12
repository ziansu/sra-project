public io.github.davidg95.equestricraftplugin.MyHorse getHorse(java.util.UUID uuid) {
    for (int i = 0; i < (horses.size()); i++) {
        if (((horses.get(i)) == null) || ((horses.get(i).getUuid()) == null)) {
            continue;
        }
        if (horses.get(i).getUuid().equals(uuid)) {
            return horses.get(i);
        }
    }
    return null;
}