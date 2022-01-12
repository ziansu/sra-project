public java.lang.String getKey() {
    if ((this.ordinal()) < 3)
        return this.toString().toLowerCase().replaceAll("_", "-");
    else
        if ((this.ordinal()) < 7)
            return "player." + (this.toString().toLowerCase().replaceAll("_", "-"));
        else
            return "player.stats." + (this.toString().toLowerCase().replaceAll("_", "-"));
        
    
}