@java.lang.Override
public void apply(final org.bson.Document document) {
    java.lang.String product_id = document.get("pid").toString();
    java.lang.String numOfReviews = document.get("#reviews").toString();
    try {
        new SpamDetector(mongo, product_id).performSpamDetection();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}