@java.lang.Override
public void initialize() throws org.opt4j.core.optimizer.TerminationException {
    old = individualFactory.create();
    population.add(old);
    completer.complete(population);
    fold = f(old);
}