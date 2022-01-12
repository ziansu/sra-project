public static int getInput(model.Desk desk) {
    int column = -1;
    java.lang.String rubbish;
    try {
        column = controller.HandleInput.reader.nextInt();
    } catch (java.lang.Exception e) {
        rubbish = controller.HandleInput.reader.next();
        controller.HandleInput.LOG.debug((((e + "\n") + rubbish) + " ist eine ungültige Eingabe!"));
    }
    return column;
}