private wildtornado.databug.objects.Prediction predictSingleProductRating(java.util.List<wildtornado.databug.objects.Predictor> predictors, int product) {
    double distance = getDistanceTotal(predictors);
    double rating = 0;
    for (wildtornado.databug.objects.Predictor p : predictors) {
        rating += ((p.getDistance()) / distance) * (p.getRating());
    }
    return new wildtornado.databug.objects.Prediction(currentUser, product, rating);
}