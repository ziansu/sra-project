@java.lang.Override
public void act(pursuitDomain.Environment environment) {
    if ((environment.predatorGreedyDistancePrey(this)) > 1) {
        execute(decide(environment), environment);
    }
    if ((environment.predatorGreedyDistancePrey(this)) == 1) {
        java.lang.System.out.println("ACHOU");
    }
}