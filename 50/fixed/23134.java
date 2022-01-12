public klondike.controller.MoveController getMoveController(int option) {
    assert (option > 0) && (option <= (klondike.controller.MenuController.NUMBER_OF_CONTROLLERS));
    return controllers[(option - 1)];
}