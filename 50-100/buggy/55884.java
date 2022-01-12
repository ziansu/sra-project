@java.lang.Override
public double doOperation() throws beast.inference.operators.OperatorFailedException {
    flipMomentum();
    corruptMomentum();
    final double storedK = kineticEnergy();
    p.storeParameterValues();
    simulateDynamics();
    flipMomentum();
    final double proposedK = kineticEnergy();
    return proposedK - storedK;
}