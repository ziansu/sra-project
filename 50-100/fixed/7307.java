public void clear() {
    de.baleipzig.iris.common.Dimension dim = this.dim();
    layer.clear();
    for (int i = 0; i < (dim.getY()); i++) {
        java.util.Vector<de.baleipzig.iris.model.neuralnet.node.INode> row = new java.util.Vector<>();
        for (int j = 0; j < (dim.getX()); j++)
            row.add(null);
        
        layer.add(row);
    }
}