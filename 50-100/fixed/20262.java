@java.lang.Override
public void traverse() {
    java.util.Iterator<T> iterator = iterator();
    while (iterator.hasNext()) {
        java.lang.System.out.print(iterator.next());
        if (iterator.hasNext()) {
            java.lang.System.out.print(" -> ");
        }
    } 
    java.lang.System.out.println();
}