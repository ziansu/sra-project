@java.lang.Override
public tau.verification.sphereInterval.lattice.FactoidsConjunction invoke(tau.verification.sphereInterval.lattice.FactoidsConjunction factoidsConjunction) {
    if (factoidsConjunction.isBottom()) {
        return tau.verification.sphereInterval.lattice.FactoidsConjunction.getBottom();
    }
    tau.verification.sphereInterval.lattice.FactoidsConjunction result = tau.verification.sphereInterval.lattice.FactoidsConjunction.getFactoidsConjunction(factoidsConjunction);
    result.removeFactoid(this.sphereVariable);
    result.update(new tau.verification.sphereInterval.lattice.Factoid(sphereVariable, x0, y0, z0, edgeA, edgeB, edgeC, radios));
    return result;
}