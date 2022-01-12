@java.lang.Override
public mcjty.gui.widgets.Widget mouseClick(mcjty.gui.Window window, int x, int y, int button) {
    if (isEnabledAndVisible()) {
        int index = choiceList.indexOf(currentChoice);
        index++;
        if (index >= (choiceList.size())) {
            index = 0;
        }
        currentChoice = choiceList.get(index);
        setText(currentChoice);
        fireChoiceEvents(currentChoice);
    }
    return null;
}