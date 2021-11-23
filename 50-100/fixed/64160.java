@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj == null) {
        return false;
    }
    if ((getClass()) != (obj.getClass())) {
        return false;
    }
    final nl.tudelft.pl2016gr2.gui.model.PhylogeneticTreeNode other = ((nl.tudelft.pl2016gr2.gui.model.PhylogeneticTreeNode) (obj));
    return (this.node) == (other.node);
}