public boolean accept(org.eclipse.draw2d.IFigure figure) {
    boolean value = peekInheritedInteractiveEdit(figure);
    inheritedInteractiveStack.clear(((inheritedInteractiveStack.length()) - 1));
    return value;
}