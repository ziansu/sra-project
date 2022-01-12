private void findJourneyPics(com.xiangyou.product.Product.Day day, int index, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> journeyPicsMap) {
    java.util.Map<java.lang.String, java.lang.String> pictures = journeyPicsMap.get(((com.xiangyou.product.ProductRepository.PREFIX_DAY) + index));
    day.addAllPictures(pictures);
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : pictures.entrySet()) {
        day.addPicture(entry.getKey(), entry.getValue());
    }
}