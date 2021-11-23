@java.lang.Override
public de.wilson.wdtreelist.TestObject getItemObject(de.wilson.wdtreelistlibrary.WDTreeObject parent, int pos, int depth) {
    if (parent == null)
        return object;
    else
        return object.getChildren().get(pos);
    
}