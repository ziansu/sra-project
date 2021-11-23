void freezeXrefs() {
    switch (xrefs.size()) {
        case 0 :
            xrefs = java.util.Collections.emptyList();
            break;
        case 1 :
            org.obolibrary.oboformat.model.Xref xref = xrefs.iterator().next();
            xrefs = java.util.Collections.singletonList(xref);
            break;
        default :
            if ((values) instanceof java.util.ArrayList) {
                ((java.util.ArrayList) (values)).trimToSize();
            }
    }
}