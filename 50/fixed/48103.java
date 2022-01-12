public void reset() {
    main.gui.GUIFront.backend.setStartNode(null);
    main.gui.GUIFront.backend.setEndNode(null);
    main.gui.GUIFront.reset = true;
    main.gui.GUIFront.setEnd = false;
    main.gui.GUIFront.setStart = false;
    main.gui.GUIFront.removeLine = true;
}