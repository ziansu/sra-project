@java.lang.Override
public void addNode(java.util.Map<java.lang.String, java.lang.Object> fieldMap) {
    cn.cjtblog.domain.Node node = cn.cjtblog.util.BeanUtil.createEntity(cn.cjtblog.domain.Node.class, fieldMap);
    nodeDAO.add(node);
    cn.cjtblog.util.FileUtil.makeDir(node.getId());
}