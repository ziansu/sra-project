@java.lang.Override
public java.lang.String toString() {
    java.lang.String str = "";
    java.util.List<jp.hichain.prototype.basic.ChainNode> roots = getRoots();
    for (int i = 0; i < (roots.size()); i++) {
        jp.hichain.prototype.basic.ChainNode root = roots.get(i);
        str += " > " + (root.toScoredString(""));
        if (i < ((roots.size()) - 1))
            str += "\n";
        
    }
    return str;
}