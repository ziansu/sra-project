@java.lang.Override
public void step(neutrality.NeutralityModel model, int step, java.util.Optional<java.lang.Double> substep) {
    if (step == 0)
        super.step(model, step, substep);
    
    double toInvest = getSectorInvestment(model.getMarketInformation((step - 1)));
    makeContentInvestment(step, toInvest);
}