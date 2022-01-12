@java.lang.Override
public void step(neutrality.NeutralityModel model, int step, java.util.Optional<java.lang.Double> substep) {
    if (step == 0) {
        super.step(model, step, substep);
    }else {
        neutrality.MarketInfo mi = getModel().getMarketInformation((step - 1));
        double mktNetInvest = mi.nspNetworkInvestment;
        makeNetworkInvestment(step, mktNetInvest);
        if (getModel().policyNSPContentAllowed) {
            double mktVidInvest = mi.nspVideoInvestment;
            makeContentInvestment(step, mktVidInvest);
        }else {
            makeContentInvestment(step, 0);
        }
    }
}