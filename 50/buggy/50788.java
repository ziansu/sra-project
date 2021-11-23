public static cards.seniordesign.com.cards.api.JeezAPIInterface getAPI() {
    if ((cards.seniordesign.com.cards.api.JeezAPIClient.service) == null) {
        cards.seniordesign.com.cards.api.ServiceGenerator.createService(null);
    }
    return cards.seniordesign.com.cards.api.JeezAPIClient.service;
}