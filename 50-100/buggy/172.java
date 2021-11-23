public java.util.List<fi.helsinki.cs.mobiilitiedekerho.backend.models.Like> describeAnswerLikes(java.lang.String answerId) {
    java.lang.String sql = "SELECT * FROM slaikka " + "WHERE answer_id = :aid";
    try (fi.helsinki.cs.mobiilitiedekerho.backend.services.Connection con = sql2o.open()) {
        java.util.List<fi.helsinki.cs.mobiilitiedekerho.backend.models.Like> likes = con.createQuery(sql).addParameter("aid", java.lang.Integer.parseInt(answerId)).executeAndFetch(fi.helsinki.cs.mobiilitiedekerho.backend.models.Like.class);
        return likes;
    }
}