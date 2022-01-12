public static controllers.Result criteria() {
    controllers.User _user = controllers.User.findByUserId(java.lang.Long.parseLong(session("userId")));
    play.Logger.info((("[" + (_user.username)) + "] user admin page."));
    java.util.List<controllers.RateCriterion> rateCriteria = controllers.RateCriterion.findAll();
    java.util.List<controllers.VoteCriterion> voteCriteria = controllers.VoteCriterion.findAll();
    java.util.List<controllers.Settings> webconfig = controllers.Settings.findAll();
    return ok(admin_criteria.render(_user, rateCriteria, voteCriteria));
}