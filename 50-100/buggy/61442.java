public java.lang.String getKey() {
    if ((this.ordinal()) < 3)
        return name().toLowerCase().replaceAll("_", "-");
    else
        if ((this.ordinal()) < 7)
            return "player." + (name().toLowerCase().replaceAll("_", "-"));
        else
            return "player.stats." + (name().toLowerCase().replaceAll("_", "-"));
        
    
}