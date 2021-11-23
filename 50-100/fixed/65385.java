private cz.commons.layoutManager.DepthRowNode getDepthRowNode(cz.commons.layoutManager.ElementInfo info) {
    java.lang.System.out.println(info);
    if ((info.getDepth()) > (manager.getDepthManager().getMaxDepth())) {
        manager.getDepthManager().addDepth();
    }
    return manager.getDepthManager().getDepth(info.depth).getNodeElement(info.indexAtRow);
}