public void saveComposition() {
    proj8BeckChanceRemondiSalerno.Models.Composition composition = new proj8BeckChanceRemondiSalerno.Models.Composition(new java.util.ArrayList(notesMapProperty.keySet()));
    try {
        changeSinceLastSave = compositionFileManager.saveComposition(composition);
    } catch (java.lang.Exception e) {
    }
}