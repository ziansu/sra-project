public static com.player.specific.config.utils.Config getConfig(java.lang.String n) {
    if ((com.player.specific.config.utils.Config.configs) != null) {
        for (int i = 0; i < (com.player.specific.config.utils.Config.configs.size()); i++) {
            if (com.player.specific.config.utils.Config.configs.get(i).getName().equals(n)) {
                return com.player.specific.config.utils.Config.configs.get(i);
            }
        }
    }
    return new com.player.specific.config.utils.Config(n);
}