public boolean isCharacterGroupCreator() {
    if ((characterGroup) == null)
        return false;
    
    return com.universeprojects.miniup.server.GameUtils.equals(this.character.getKey(), this.characterGroup.getProperty("creatorKey"));
}