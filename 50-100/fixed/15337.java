@java.lang.Override
public boolean equals(java.lang.Object x) {
    if ((x == null) || (!(x instanceof jcmp.DocCompare.DefaultIdentity))) {
        return false;
    }
    jcmp.DocCompare.DefaultIdentity d = ((jcmp.DocCompare.DefaultIdentity) (x));
    for (int i = 0; i < (nodes.length); i++) {
        if (!(d.nodes[i].equals(nodes[i])))
            return false;
        
    }
    return true;
}