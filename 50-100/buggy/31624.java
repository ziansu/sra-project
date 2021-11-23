public int getStartTime() {
    if (enoughComments) {
        java.util.HashMap<models.snippet.Comment, java.lang.String> map = ((java.util.HashMap<models.snippet.Comment, java.lang.String>) (retriever.getCommentsWithString(trackid)));
        java.util.HashSet<models.snippet.Comment> set = ((java.util.HashSet<models.snippet.Comment>) (processContent(map)));
        models.snippet.TimedSnippet ts = models.snippet.CommentIntensitySeeker.seek(set);
        return ts.getStartTime();
    }else {
        return 0;
    }
}