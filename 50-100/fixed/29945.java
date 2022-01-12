public void print() {
    java.util.Set set = this.eloRatings.entrySet();
    java.util.Iterator iterator = set.iterator();
    while (iterator.hasNext()) {
        java.util.Map.Entry mentry = ((java.util.Map.Entry) (iterator.next()));
        java.lang.System.out.println((((mentry.getKey()) + ": ") + (((recommendation.EloRating) (mentry.getValue())).getRating())));
    } 
}