@java.lang.Override
public T apply(int n) {
    if (n < (org.lopina.tree.binary.Branch.left().size())) {
        return org.lopina.tree.binary.Branch.left().apply(n);
    }else
        if (n > (org.lopina.tree.binary.Branch.left().size())) {
            return org.lopina.tree.binary.Branch.right().apply(((n - (org.lopina.tree.binary.Branch.left().size())) - 1));
        }else {
            return elem;
        }
    
}