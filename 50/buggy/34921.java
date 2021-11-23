public static void main(java.lang.String[] args) {
    java.util.List<amosalexa.services.pricequery.aws.model.Item> items = amosalexa.services.pricequery.aws.request.AWSLookup.itemSearch("Iphone", 1, null);
    for (amosalexa.services.pricequery.aws.model.Item item : items) {
        amosalexa.services.pricequery.aws.request.AWSLookup.log.info(item.getTitle());
    }
}