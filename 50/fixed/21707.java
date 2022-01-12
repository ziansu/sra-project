@java.lang.SuppressWarnings(value = "WhileLoopReplaceableByForEach")
@java.lang.Override
public boolean test() {
    boolean result = false;
    java.util.Iterator<java.lang.Integer> it = queue.iterator();
    while (it.hasNext()) {
        result = (it.next()) != null;
    } 
    return result;
}