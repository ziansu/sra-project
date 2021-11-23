@java.lang.Override
public models.snippet.TimedSnippet seek() {
    return new models.snippet.TimedSnippet(models.seeker.CommentIntensitySeeker.getStartTime());
}