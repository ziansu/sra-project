private org.woehlke.twitterwall.oodm.entities.Mention getMention(java.lang.String mentionString, org.woehlke.twitterwall.oodm.entities.Task task) {
    long idTwitter = 10000000L;
    java.lang.String screenName = mentionString;
    java.lang.String name = mentionString;
    return new org.woehlke.twitterwall.oodm.entities.Mention(task, null, idTwitter, screenName, name);
}