public static void setOwner(int fieldNumber, java.lang.String name) {
    switch (Game.BoundaryController.mode) {
        case GUI :
            desktop_resources.GUI.setOwner(fieldNumber, name);
            break;
        case Test :
            break;
    }
}