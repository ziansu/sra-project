@java.lang.Override
public void addChild(io.jpress.model.Taxonomy child) {
    if (null == (childList)) {
        childList = new java.util.ArrayList<io.jpress.model.Taxonomy>();
    }
    if (!(childList.contains(child))) {
        childList.add(child);
    }
}