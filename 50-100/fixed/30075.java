@java.lang.Override
public double calculateUtility(firefighters.actions.Plan plan, firefighters.agent.Agent agent) {
    double weatherUtility;
    return ((fixedFunction.calculateUtility(plan, agent)) + ((weightRisk) * (riskFunction.calculateUtility(plan, agent)))) + ((weightCooperating) * (cooperativeFunction.calculateUtility(plan, agent)));
}