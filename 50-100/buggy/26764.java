@java.lang.Override
public java.lang.String visitIncrementExpr(kalang.compiler.IncrementExpr node) {
    java.lang.String op = (node.isIsDesc()) ? "--" : "++";
    java.lang.String vn = visit(node.getExpr());
    if (node.isIsPrefix()) {
        return (("(" + op) + vn) + ")";
    }else {
        return (("(" + vn) + op) + ")";
    }
}