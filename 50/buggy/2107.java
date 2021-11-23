public java.util.List<twitterBlue.entity.Tweet> listReTweets(java.lang.Long authorId) {
    return em.createQuery("SELECT t FROM Tweet t JOIN FETCH t.user u WHERE u.id=:pauthorId ORDER BY t.createdOn DESC", twitterBlue.entity.Tweet.class).setParameter("pauthorId", authorId).setMaxResults(twitterBlue.service.TweetService.MaxTweetsPerPage).getResultList();
}