public java.util.List<com.vigglet.oei.servicerow.Servicerow> orderByListorder(int service) {
    java.util.List<com.vigglet.oei.servicerow.Servicerow> result = ((java.util.List<com.vigglet.oei.servicerow.Servicerow>) (findByService(service)));
    result.sort((com.vigglet.oei.servicerow.Servicerow o1,com.vigglet.oei.servicerow.Servicerow o2) -> (o1.getListorder()) - (o2.getListorder()));
    return result;
}