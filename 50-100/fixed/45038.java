public void delCount(java.lang.String player, java.lang.String type) {
    cn.nukkit.utils.Config cd = new cn.nukkit.utils.Config(((((getDataFolder()) + "/Vip/") + (player.toLowerCase())) + ".yml"), cn.nukkit.utils.Config.YAML);
    cd.set(type, ((java.lang.Integer.parseInt(cd.get(type).toString())) - 1));
    cd.save();
}