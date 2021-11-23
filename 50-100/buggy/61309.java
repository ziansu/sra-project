public java.lang.String getTypeName() {
    switch (type) {
        case CUPIDON :
            return "Cupidon";
        case HUNTER :
            return "Chasseur";
        case SEER :
            return "Voyant";
        case THIEF :
            return "Voleur";
        case VILLAGER :
            return "Villageois";
        case WEREWOLF :
            return "Loup";
        case WITCH :
            return "Sorcier";
    }
    return "";
}