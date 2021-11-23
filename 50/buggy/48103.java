public void reset() {
    main.gui.GUIFront.backend.setStartNode(null);
    main.gui.GUIFront.backend.setEndNode(null);
    main.gui.GUIFront.reset = true;
    main.gui.GUIFront.setEnd = false;
    main.gui.GUIFront.setStart = false;
    panelMap.startEndNodes.clear();
    main.gui.GUIFront.backend.removePath();
    main.gui.GUIFront.removeLine = true;
}