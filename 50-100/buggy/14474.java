public boolean characterExists(java.lang.Character c) {
    for (int i = 0; i < (this.charList.size()); i++) {
        if ((c.getCharacterName().toUpperCase().equals(this.charList.get(i).getCharacterName())) == true)
            return true;
        
    }
    return false;
}