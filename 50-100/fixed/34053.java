@java.lang.Override
public double getFitness() {
    fit = (1.0 * (preysCaptured)) / (preys);
    if ((fit) < (fitCutValue)) {
        return 0.0;
    }
    return ((fit) - (fitCutValue)) / (1.0 - (fitCutValue));
}