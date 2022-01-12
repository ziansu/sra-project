@java.lang.Override
public void handle(javafx.scene.input.MouseEvent event) {
    final java.util.List<edu.wpi.cs.lmp.objects.IObject> mouseOver = getAt(event.getX(), event.getY());
    try {
        resizer.setIObject(mouseOver.get(0));
    } catch (java.lang.IndexOutOfBoundsException e) {
        java.lang.System.out.println("No object found: OnEntered()");
    }
}