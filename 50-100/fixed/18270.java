@java.lang.Override
public com.admazing.SavePromotionUseResponse savePromotionUse(com.admazing.SavePromotionUseRequest parameters) {
    com.admazing.SavePromotionUseResponse response = new com.admazing.SavePromotionUseResponse();
    response.setResult(false);
    java.lang.String idUser = parameters.getIdUser();
    java.lang.String idPromotion = parameters.getIdPromotion();
    boolean resultSavePromotionUse = promotionUseRepository.save(idUser, idPromotion);
    if (resultSavePromotionUse) {
        java.lang.System.out.println(idPromotion);
    }
    return response;
}