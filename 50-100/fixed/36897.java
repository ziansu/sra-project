@java.lang.Override
public void moveToFront(int index) {
    if ((shapes.size()) <= index)
        return ;
    
    cs355.model.drawing.Shape s = shapes.get(index);
    shapes.remove(index);
    currentShapeIndex = shapes.size();
    addShape(s);
}