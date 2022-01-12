@java.lang.Override
public java.lang.Double apply(pl.edu.agh.student.simulatedannealing.solver.ComputationState computationState) {
    int summOfPizzasDelivered = 0;
    for (pl.edu.agh.student.simulatedannealing.model.PizzaDeliverer deliverer : computationState.getPizzaDeliverers()) {
        if (!(deliverer.isAbleToCollectThePizzas())) {
            return 0.0;
        }
        summOfPizzasDelivered += deliverer.getAssignedPizzas().size();
    }
    return ((double) (summOfPizzasDelivered));
}