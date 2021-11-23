public static void voltageChecked(java.lang.String UID) {
    if ((objects.Brick.getBrick(connectionData.BrickList, UID).checked2) == false) {
        objects.Brick.check2Brick(objects.Brick.getBrick(connectionData.BrickList, UID));
        windowController.hideUnhidePlot(objects.Brick.getBrick(connectionData.BrickList, UID), 1);
    }else {
        objects.Brick.uncheck2Brick(objects.Brick.getBrick(connectionData.BrickList, UID));
        windowController.hideUnhidePlot(objects.Brick.getBrick(connectionData.BrickList, UID), 1);
    }
}