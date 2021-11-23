@java.lang.Override
public void dragLeave(org.eclipse.swt.dnd.DropTargetEvent event) {
    java.lang.System.out.println("dragLeave() called");
    java.lang.System.out.println(("event.detail == " + (event.detail)));
    java.lang.System.out.println(("event.feedback == " + (event.feedback)));
}