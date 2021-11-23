public me.redraskal.arcadia.api.translation.Translation fetchTranslation(java.lang.String name, org.bukkit.entity.Player player) {
    if (((player.getLocale()) == null) || (player.getLocale().isEmpty())) {
        return this.fetchTranslation(name);
    }else {
        return this.fetchTranslation(name, new java.util.Locale(player.getLocale().split("_")[0], player.getLocale().split("_")[1]));
    }
}