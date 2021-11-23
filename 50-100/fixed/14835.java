void addJobsToOrder(android.content.Context context, ly.kite.catalogue.Product product, int orderQuantity, java.util.HashMap<java.lang.String, java.lang.String> optionsMap, java.util.List<ly.kite.ordering.ImageSpec> imageSpecList, boolean nullImagesAreBlank, ly.kite.ordering.Order order) {
    java.util.List<java.util.List<ly.kite.ordering.ImageSpec>> imageSpecLists = ly.kite.journey.UserJourneyType.splitImagesIntoJobs(product, imageSpecList, nullImagesAreBlank);
    for (java.util.List<ly.kite.ordering.ImageSpec> jobImageSpecList : imageSpecLists) {
        order.addJob(ly.kite.ordering.Job.createPrintJob(product, orderQuantity, optionsMap, jobImageSpecList, nullImagesAreBlank));
    }
}