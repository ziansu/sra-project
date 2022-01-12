public java.util.List makeMajorRecommendations(java.lang.String major) {
    Recommendations = new java.util.ArrayList<Movie>();
    for (java.lang.String s : movies.keySet()) {
        if (movies.get(s).getMajor().equals(major)) {
            Recommendations.add(movies.get(s));
        }
    }
    return Recommendations;
}