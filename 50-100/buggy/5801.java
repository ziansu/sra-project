public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String targetNode = javax.swing.JOptionPane.showInputDialog(null, "Nó:", "Torrhen Stark");
    if (!(targetNode.isEmpty())) {
        Node node = newGraph.findNodebyName(targetNode);
        java.lang.String dfs = node.buscaProfundidade();
        javax.swing.JOptionPane.showMessageDialog(null, dfs);
        newGraph.resetGraph();
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, "É necessário inserir o nome de um nó");
    }
}