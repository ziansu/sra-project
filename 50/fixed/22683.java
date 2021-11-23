public static rx.Observable<java.util.List<com.example.alexander.yandexmoneyshops.data.entity.ShopEntity>> getShopsFromWeb() {
    return com.example.alexander.yandexmoneyshops.data.web.YandexMoneyShopsFetcher.sYandexMoneyShopsService.getShops();
}