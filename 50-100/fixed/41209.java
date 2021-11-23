@java.lang.Override
public void onMessage(org.animotron.manipulator.PFlow pf) {
    org.animotron.io.PipedInput<org.animotron.manipulator.QCAVector> destination = org.animotron.statement.animo.update.Utils.getByREF(pf);
    try {
        execute(destination, org.animotron.graph.index.Order.context(pf.getOP().getEndNode()));
    } catch (java.io.IOException e) {
        pf.sendException(e);
        return ;
    }
    pf.done();
}