public <T extends com.raams.model.Shape> void drawAll(java.util.List<T> shapes) {
    if ((shapes.size()) > 1)
        shapes.add(shapes.remove(0));
    
    for (com.raams.model.Shape s : shapes) {
    }
}