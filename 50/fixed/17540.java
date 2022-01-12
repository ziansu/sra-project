@java.lang.Override
public de.wilson.wdtreelist.TestObject getItemObject(de.wilson.wdtreelist.TestObject parent, int pos, int depth) {
    if (parent == null)
        return object;
    else
        return parent.getChildren().get(pos);
    
}