@java.lang.Override
public void act(pursuitDomain.Environment environment) {
    if ((environment.predatorGreedyDistancePrey(this)) > 0) {
        execute(decide(environment), environment);
    }
    if ((environment.predatorGreedyDistancePrey(this)) == 0) {
        java.lang.System.out.println("ACHOU");
    }
}