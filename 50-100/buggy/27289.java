public static play.mvc.Result commonTimeList() {
    if ((controllers.Application.currentClient) == null) {
        return redirect(routes.Application.landing());
    }
    java.util.List<controllers.TimePair> tp = controllers.Event.findWeeklyCommonFreetime(controllers.Application.eventClientList, controllers.Event.currentDate());
    java.util.List<java.lang.String> s = controllers.Event.timeListToString(tp);
    return ok(commonTime.render());
}