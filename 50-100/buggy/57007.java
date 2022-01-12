public static interactor.Interactor getInstance(gui.DemonstrationWindowController controller) {
    if ((interactor.Interactor.singleton) == null) {
        interactor.Interactor.singleton = new interactor.Interactor(controller);
    }
    if (((interactor.Interactor.singleton.controller) == null) && (controller != null)) {
        interactor.Interactor.singleton.controller = controller;
        interactor.Interactor.singleton.textArea = controller.getTextArea();
        interactor.Interactor.singleton.graph = controller.getGraphPane();
    }
    return interactor.Interactor.singleton;
}