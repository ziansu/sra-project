private boolean checkBlackList(com.nincodedo.ninsmodlister.common.NinModContainer mod) {
    try {
        for (java.lang.String blackListItem : blackList) {
            if ((java.util.regex.Pattern.matches(blackListItem, mod.getName())) || (java.util.regex.Pattern.matches(blackListItem, mod.getModId()))) {
                return false;
            }
        }
    } catch (java.util.regex.PatternSyntaxException e) {
        com.nincodedo.ninsmodlister.utility.LogHelper.error(e);
    }
    return true;
}