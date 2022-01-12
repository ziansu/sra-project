@java.lang.Override
public org.bukkit.configuration.ConfigurationSection getDefaultConfig() {
    org.bukkit.configuration.ConfigurationSection node = super.getDefaultConfig();
    node.set(SkillSetting.DURATION.node(), 1);
    node.set(SkillSetting.DURATION_INCREASE.node(), 1);
    node.set(SkillSetting.RADIUS.node(), 1);
    node.set(SkillSetting.RADIUS_INCREASE.node(), 1);
    node.set("apply-text", "TEST-APPLY");
    node.set("fade-text", "TEST-FADE");
    return node;
}