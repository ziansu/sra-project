@java.lang.Override
public void setCharacter(java.lang.Character character) {
    if ((this.character) != null) {
        if ((this.character) instanceof java.lang.Runnable)
            runnables.remove(this.character);
        
        this.character.onCharacterRemove(this);
    }
    this.character = character;
    if (character != null) {
        if (character instanceof java.lang.Runnable)
            runnables.add(((java.lang.Runnable) (character)));
        
        character.onCharacterSet(this);
    }
}