@java.lang.Override
public void addNode(cn.cjtblog.domain.Node node) {
    nodeDAO.add(node);
    cn.cjtblog.util.FileUtil.makeDir(node.getId());
}