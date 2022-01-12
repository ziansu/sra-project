@java.lang.Override
public com.admazing.SaveAccessResponse saveAccess(com.admazing.SaveAccessRequest parameters) {
    com.admazing.SaveAccessResponse response = new com.admazing.SaveAccessResponse();
    com.admazing.CommercialAreaModel commercialAreaModel = commercialAreaRepository.getByLatitudeLongitude(parameters.getLatitude(), parameters.getLongitude());
    if (commercialAreaModel != null) {
        response.setNameCommercialArea(commercialAreaModel.getNameCommercialArea());
        boolean result = accessRepository.save(parameters.getIdUser(), commercialAreaModel.getIdCommercialArea());
        response.setResult(result);
    }else {
        response.setResult(false);
    }
    return response;
}