@java.lang.Override
public void eval(ec.EvolutionState es, int i, ec.gp.GPData gpdata, ec.gp.ADFStack adfs, ec.gp.GPIndividual gpi, ec.Problem prblm) {
    algorithm.TreeData data = ((algorithm.TreeData) (gpdata));
    for (int x = 0; x < (children.length); ++x) {
        data.machine(getID(), children[x]);
        children[x].eval(es, i, data, adfs, gpi, prblm);
    }
}