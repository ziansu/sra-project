@java.lang.Override
public final fr.skyost.algo.desktop.utils.AlgoTreeNode clone() {
    try {
        if ((line) != null) {
            return new fr.skyost.algo.desktop.utils.AlgoTreeNode(line);
        }
        final fr.skyost.algo.desktop.utils.AlgoTreeNode clone = ((fr.skyost.algo.desktop.utils.AlgoTreeNode) (super.clone()));
        clone.setAlgoLine(line.clone());
        return clone;
    } catch (final java.lang.Exception ex) {
        ex.printStackTrace();
    }
    return null;
}