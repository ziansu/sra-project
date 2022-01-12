@java.lang.Override
public void meet(org.eclipse.rdf4j.query.algebra.Extension e) {
    super.meet(e);
    for (org.eclipse.rdf4j.query.algebra.ExtensionElem elem : e.getElements()) {
        res.add(elem.getName());
    }
}