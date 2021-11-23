public <S> S resolveService(java.lang.Class<S> serviceClass) {
    edu.fudan.se.crowdservice.core.ConcreteService service = ((edu.fudan.se.crowdservice.core.ConcreteService) (resolver.resolveService(serviceClass)));
    if (service.isCrowd()) {
        int resultNum = intInput(((service.getServiceInterfacesName()) + " binds a CrowdService.\nPlease input expected Result Number for this Service:"));
        resultNums.put(service.getClass().getName(), resultNum);
    }
    return new edu.fudan.se.crowdservice.core.Template.ServiceHandler<S>().newProxyInstance(((S) (service)));
}