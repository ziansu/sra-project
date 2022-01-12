private void showAddFlashcardsDialog() {
    cards = project.getAllCards();
    gui.AddFlashcardDialog d;
    try {
        d = new gui.AddFlashcardDialog(null, project, this);
        d.setVisible(true);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}