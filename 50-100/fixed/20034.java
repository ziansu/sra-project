public org.olap4j.mdx.ParseTreeNode visit() {
    if ((Type.ALL.equals(level.getLevelType())) && (operator.equals(Operator.MEMBERS))) {
        try {
            return org.olap4j.query.Olap4jNodeConverter.toOlap4j(level.getHierarchy().getDefaultMember(), Operator.MEMBER);
        } catch (org.olap4j.OlapException e) {
            e.printStackTrace();
        }
    }
    return org.olap4j.query.Olap4jNodeConverter.toOlap4j(level, operator);
}