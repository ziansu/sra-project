@java.lang.Override
public boolean match(org.jsfr.json.path.PathOperator pathOperator) {
    return ((super.match(pathOperator)) && (pathOperator instanceof org.jsfr.json.path.ChildNode)) && (children.contains(((org.jsfr.json.path.ChildNode) (pathOperator)).getKey()));
}