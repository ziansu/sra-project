private java.util.List<de.fau.cs.mad.kwikshop.common.sorting.BoughtItem> getSiblings(de.fau.cs.mad.kwikshop.common.sorting.BoughtItem child) {
    java.util.List<de.fau.cs.mad.kwikshop.common.sorting.BoughtItem> siblings = new java.util.ArrayList<de.fau.cs.mad.kwikshop.common.sorting.BoughtItem>();
    for (de.fau.cs.mad.kwikshop.common.sorting.BoughtItem parent : getParents(child)) {
        siblings.addAll(getChildren(parent));
    }
    while (siblings.remove(child)) {
    } 
    return siblings;
}