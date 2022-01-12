public java.util.Optional<java.lang.String> submitComment(java.lang.String text, net.dean.jraw.models.Submission submission) {
    try {
        final java.lang.String commentId = accountManager.reply(submission, text);
        com.fallingdutchman.youtuberedditbot.authentication.reddit.jraw.RedditManager.log.info("posted comment to %s on /r/%s, with id %s", submission.getId(), submission.getSubredditName(), commentId);
        return java.util.Optional.of(commentId);
    } catch (net.dean.jraw.ApiException e) {
        com.fallingdutchman.youtuberedditbot.authentication.reddit.jraw.RedditManager.log.error("was unable to post comment", e);
        return java.util.Optional.empty();
    }
}