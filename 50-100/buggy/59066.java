private int countPromotionsUsed(java.lang.String idUser, java.lang.String idCategory) {
    int nPromotionUsed = 0;
    java.util.List<com.admazing.PromotionUseModel> promotionsUse = promotionUseRepository.findById(idUser);
    for (com.admazing.PromotionUseModel promotionUse : promotionsUse) {
        com.admazing.PromotionModel promotion = promotionRepository.findById(promotionUse.getIdPromotion());
        if ((promotion.getIdCategory()) == idCategory) {
            nPromotionUsed++;
        }
    }
    java.lang.System.out.println(nPromotionUsed);
    return nPromotionUsed;
}