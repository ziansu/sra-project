static java.lang.String mapTypeToNodeName(org.simiancage.DeathTpPlus.helpers.DeathMessagesDTP.DeathEventType deathEventType) {
    if (deathEventType == (org.simiancage.DeathTpPlus.helpers.DeathMessagesDTP.DeathEventType.CAVE_SPIDER)) {
        return "cavespider";
    }else
        if (deathEventType == (org.simiancage.DeathTpPlus.helpers.DeathMessagesDTP.DeathEventType.PIG_ZOMBIE)) {
            return "pigzombie";
        }
    
    java.lang.String nodeName = deathEventType.toString().toLowerCase();
    if ((!(deathEventType.toString().equals("BLOCK_EXPLOSION"))) && (!(deathEventType.toString().equals("FIRE_TICK")))) {
        nodeName = nodeName.replace("_", "-");
    }
    return nodeName;
}