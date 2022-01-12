public java.util.List<org.caliog.myRPG.Items.ItemEffect> getEffects() {
    org.bukkit.configuration.ConfigurationSection sec = config.getConfigurationSection("item-effects");
    this.effects.clear();
    for (org.caliog.myRPG.Items.ItemEffect.ItemEffectType type : org.caliog.myRPG.Items.ItemEffect.ItemEffectType.values()) {
        if (sec.isInt(type.name())) {
            this.effects.add(new org.caliog.myRPG.Items.ItemEffect(type, sec.getInt(type.name())));
        }
    }
    return this.effects;
}