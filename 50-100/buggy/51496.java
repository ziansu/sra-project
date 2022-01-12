public static void main(java.lang.String[] args) {
    rpggame.DialogueGenerator.loadWordClasses();
    rpggame.DialogueGenerator.loadTemplate();
    rpggame.DialogueGenerator.populateMap();
    rpggame.DialogueGenerator.generateDialogues(10000, 3, 15);
    rpggame.DialogueGenerator.printDialoguesToFile();
    rpggame.MapGenerator.generate(40);
    rpggame.Gui gui = new rpggame.Gui();
    gui.makeVisible();
}