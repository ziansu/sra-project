public void addElement(com.mocircle.cidrawing.element.DrawElement element) {
    if (element != null) {
        elements.add(element);
        element.setBoardId(boardId);
    }
}