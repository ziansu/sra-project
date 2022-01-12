public void addCharacter(java.lang.Character character) {
    charList.add(character);
    takenNames.add(character.getName());
    try {
        dnd.FileWriter out = new dnd.FileWriter(new dnd.File(filename), true);
        out.write(((character.getRecordString()) + "\r\n"));
        out.close();
    } catch (dnd.IOException e) {
    }
}