public boolean isEnabled() {
    switch (this) {
        case DEFAULT_CRUCIBLE_LIQUIDS :
            {
                return true;
            }
        case LOOT_TABLES :
            {
                return true;
            }
        case TINKERS_INTEGRATION :
            {
                return eiteam.esteemedinnovation.init.misc.integration.CrossMod.TINKERS_CONSTRUCT;
            }
        case CRAFTTWEAKER_INTEGRATION :
            {
                return eiteam.esteemedinnovation.init.misc.integration.CrossMod.CRAFTTWEAKER;
            }
    }
    return false;
}