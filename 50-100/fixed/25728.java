@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder s = new java.lang.StringBuilder();
    java.util.Iterator<fr.lirmm.graphik.DEFT.gad.GADEdge> it = this.path.iterator();
    if (it.hasNext()) {
        s.append(it.next().getTarget());
    }
    for (fr.lirmm.graphik.DEFT.gad.GADEdge edge : this.path) {
        s.append(edge);
    }
    return s.toString();
}