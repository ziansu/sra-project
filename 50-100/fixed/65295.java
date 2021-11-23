@java.lang.Override
public synchronized java.lang.String toString() {
    java.lang.String output = ("(Graph) #elements:" + (components.size())) + ":\n";
    int k = 0;
    synchronized(components) {
        for (org.jzy3d.plot3d.primitives.AbstractDrawable c : components) {
            if (c != null)
                output += (((" Graph element [" + (k++)) + "]:") + (c.toString(1))) + "\n";
            else
                output += (" Graph element [" + (k++)) + "] (null)\n";
            
        }
    }
    return output;
}