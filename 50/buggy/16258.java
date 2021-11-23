public void saveComposition() {
    changeSinceLastSave = false;
    proj8BeckChanceRemondiSalerno.Models.Composition composition = new proj8BeckChanceRemondiSalerno.Models.Composition(new java.util.ArrayList(notesMapProperty.keySet()));
    try {
        compositionFileManager.saveComposition(composition);
    } catch (java.lang.Exception e) {
    }
}