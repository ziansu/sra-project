@java.lang.Override
public void update(java.awt.Event e) {
    setStringInButton(getFeldText());
    if ((controller.getStatusCode()) == 1);
    if ((controller.getStatusCode()) == 2) {
        messageDialog("You Lost!");
        setEnableButtons(false);
    }
    if ((controller.getStatusCode()) == 3)
        messageDialog((("You Won! " + (controller.getTimeWon())) + " Points!"));
    
}