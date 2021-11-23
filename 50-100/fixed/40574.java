@java.lang.Override
public void run() {
    addNodes(null, beans.get(stage.getRoot()));
    if ((last) == null)
        return ;
    
    java.lang.Object obj = last.getObject();
    if (obj != null) {
        com.ayocrazy.easystage.view.Node node = findNode(obj);
        if (node != null)
            node.expandTo();
        
    }
}