@asg.cliche.Command(description = "Get top ten movies")
public void getTopTenMovies() {
    java.util.List<models.Movie> topTen = recommender.getTopTenMovies();
    if ((topTen != null) && ((topTen.size()) != 0)) {
        java.lang.System.out.println("You may find these movies interesting:");
        for (models.Movie movie : topTen) {
            java.lang.System.out.println(((((movie.getTitle()) + " (") + (movie.getNote())) + ")"));
        }
    }else {
        java.lang.System.out.println("No movies in the database yet");
    }
}