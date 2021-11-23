@java.lang.Override
public void printResults(org.syncany.operations.OperationResult operationResult) {
    org.syncany.operations.plugin.PluginOperationResult concreteOperationResult = ((org.syncany.operations.plugin.PluginOperationResult) (operationResult));
    switch (concreteOperationResult.getAction()) {
        case LIST :
            printResultList(concreteOperationResult);
            return ;
        case INSTALL :
            printResultInstall(concreteOperationResult);
            return ;
        case REMOVE :
            printResultRemove(concreteOperationResult);
            return ;
        case UPDATE :
            printResultUpdate(concreteOperationResult);
            return ;
        default :
            out.println(("Unknown action: " + (concreteOperationResult.getAction())));
    }
}