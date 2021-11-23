private java.util.Stack<java.awt.MenuItem> getPlugins() {
    ain.tolva.nut.AddPlugin p = ain.tolva.nut.AddPlugin.getInstance();
    java.util.Stack<java.awt.MenuItem> plug = new java.util.Stack<>();
    while (!(p.empty())) {
        java.awt.MenuItem i = p.pop();
        if (i != null)
            plug.push(i);
        
    } 
    return plug;
}