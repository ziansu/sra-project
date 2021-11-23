@java.lang.Override
public java.lang.String onPlaceholderRequest(org.bukkit.entity.Player pPlayer, java.lang.String pIdentifier) {
    if (pPlayer == null)
        return "";
    
    switch (pIdentifier) {
        case "clantag" :
            return clanTagProvider.getClanTag(pPlayer.getUniqueId());
        case "clantag_custom_design" :
            java.lang.String clanTag = clanTagProvider.getClanTag(pPlayer.getUniqueId());
            if (!(clanTag.isEmpty()))
                return CLAN_MATCHER.replaceFirst(clanTag);
            
            return clanTag;
        default :
            return null;
    }
}