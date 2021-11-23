@java.lang.Override
public void draw() {
    double w = (bounds.getRight()) - (bounds.getLeft());
    double h = (bounds.getBottom()) - (bounds.getTop());
    ecs100.UI.drawRect(bounds.getLeft(), bounds.getTop(), w, h);
}