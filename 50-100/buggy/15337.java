@java.lang.Override
public boolean equals(java.lang.Object x) {
    if (!(x instanceof jcmp.DocCompare.DefaultIdentity)) {
        return false;
    }
    try {
        jcmp.DocCompare.DefaultIdentity d = ((jcmp.DocCompare.DefaultIdentity) (x));
        for (int i = 0; i < (nodes.length); i++) {
            if (!(d.nodes[i].equals(nodes[i])))
                return false;
            
        }
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}