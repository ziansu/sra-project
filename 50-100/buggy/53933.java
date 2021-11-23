@java.lang.Override
public void apply(final org.bson.Document document) {
    java.lang.String product_id = document.get("pid").toString();
    java.lang.String numOfReviews = document.get("#reviews").toString();
    java.lang.System.out.println(("Annotating reviews for product: " + product_id));
    if ((java.lang.Integer.parseInt(numOfReviews)) > 50) {
        try {
            new SpamDetector(mongo, product_id).performSpamDetection();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}