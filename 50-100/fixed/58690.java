public void removeChild(mazeGenerator.RecursiveBacktrackerGenerator.Node currChild) {
    java.util.Iterator<mazeGenerator.RecursiveBacktrackerGenerator.Node> childlist = children.iterator();
    while (childlist.hasNext()) {
        if ((childlist.next()) == currChild) {
            childlist.remove();
            break;
        }
    } 
}