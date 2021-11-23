public void addCharacter(java.lang.Character character) {
    charList.add(character);
    takenNames.add(character.getName());
    try {
        java.io.FileWriter out = new java.io.FileWriter(new java.io.File(filename), true);
        out.write(((character.getRecordString()) + "\r\n"));
        out.close();
    } catch (java.io.IOException e) {
    }
}