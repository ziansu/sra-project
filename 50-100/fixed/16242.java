@java.lang.Override
public void callSetNewInput(Controller.EnumIndexes controllerEnum) {
    for (int i = 0; i < (controllers.size()); i++) {
        Controller.EnumIndexes tmp = controllers.get(i).getTypeOfMenu();
        if (tmp == controllerEnum) {
            controllers.get(i).changeInputProcessor();
            break;
        }
    }
}