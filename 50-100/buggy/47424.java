public static void main(java.lang.String[] args) throws java.io.IOException {
    node.Node.log.info("Starting node");
    node.PropertyLoader propertyLoader = new node.PropertyLoader();
    propertyLoader.init();
    node.CLIListner cliListner = CLIListner.INSTANCE;
    cliListner.start();
    node.BSCommunicator bsCommunicator = BSCommunicator.INSTANCE;
    java.lang.String out = bsCommunicator.init();
    node.QueryParser qp = new node.QueryParser();
    qp.parse(out);
    node.NodeListner nodeListner = NodeListner.INSTANCE;
    nodeListner.start();
}