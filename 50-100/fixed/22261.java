public static void main(java.lang.String[] args) {
    java.lang.String folder = "/Users/fpena/UCC/Thesis/datasets/context/stuff/" + (((("cache_context/rival/yelp_hotel_recsys_contextual_records_" + "ensemble_numtopics-30_iterations-100_passes-10_") + "targetreview-specific_normalized_lang-en_bow-NN_") + "document_level-review_targettype-context_") + "min_item_reviews-10/fold_0/");
    java.lang.String testFilePath = folder + "test.csv";
    java.lang.String libfmResultsFilePath = folder + "libfm_predictions.txt";
    try {
        java.util.List<org.insightcentre.richcontext.Review> ratingReviews = org.insightcentre.richcontext.LibfmResultsParser.parseRatingResults(testFilePath, libfmResultsFilePath, false);
        for (org.insightcentre.richcontext.Review review : ratingReviews) {
            java.lang.System.out.println(review);
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}