public static java.lang.String replaceRelationPlaceholders(java.lang.String string, io.github.dre2n.factionsxl.relation.RelationParticipator standpoint, io.github.dre2n.factionsxl.relation.RelationParticipator object) {
    string = string.replaceAll(io.github.dre2n.factionsxl.util.ParsingUtil.RELATION.getPlaceholder(), standpoint.getRelation(object).getName());
    string = string.replaceAll(io.github.dre2n.factionsxl.util.ParsingUtil.RELATION_COLOR.getPlaceholder(), standpoint.getRelation(object).getColor().toString());
    return org.bukkit.ChatColor.translateAlternateColorCodes('&', string);
}