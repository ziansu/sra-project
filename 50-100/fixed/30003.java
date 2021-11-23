private void remove(com.example.a21corp.vinca.elements.Element vincaElement) {
    if (workspace.projects.remove(vincaElement)) {
        if (workspace.projects.isEmpty()) {
            initiateWorkspace();
        }
    }else {
        if ((vincaElement.getParent()) != null) {
            vincaElement.parent.containerList.remove(vincaElement);
        }
    }
    if (containsCursor(vincaElement)) {
        com.example.a21corp.vinca.elements.Element cursor = vincaElement.parent;
        if (cursor == null) {
            cursor = workspace.projects.get(0);
        }
        setCursor(cursor);
    }
}