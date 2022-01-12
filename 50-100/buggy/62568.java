public static synchronized void calculate(com.leon.rfq.products.PricingModel model, com.leon.rfq.domains.RequestDetailImpl request) {
    for (com.leon.rfq.domains.OptionDetailImpl leg : request.getLegs()) {
        model.configure(com.leon.rfq.services.CalculationServiceImpl.extractModelInputs(leg));
        com.leon.rfq.services.CalculationServiceImpl.extractModelOutputs(model.calculate(), leg);
    }
}