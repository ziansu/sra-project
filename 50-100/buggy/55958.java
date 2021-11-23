@java.lang.Override
public void process(us.codecraft.webmagic.ResultItems resultItems, us.codecraft.webmagic.Task task) {
    if ((resultItems.getAll().size()) > 0) {
        com.seveniu.node.Node node = resultItems.get(MyPageProcessor.CONTEXT_NODE);
        if (node == null) {
            logger.warn("pipeline get node is null");
        }
        consumer.transfer(node);
    }
}