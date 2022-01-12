public void save() {
    java.io.File partyFile = fileRef.get();
    java.util.List<java.io.File> characterFiles = new java.util.ArrayList<>();
    for (pcgen.facade.core.CharacterFacade character : this) {
        characterFiles.add(character.getFileRef().get());
    }
    pcgen.io.PCGIOHandler.write(partyFile, characterFiles);
}