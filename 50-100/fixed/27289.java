public static play.mvc.Result commonTimeList() {
    java.util.List<controllers.TimePair> tp = controllers.Event.findWeeklyCommonFreetime(controllers.Application.eventClientList, controllers.Event.currentDate());
    java.util.List<java.lang.String> s = controllers.Event.timeListToString(tp);
    return ok(commonTime.render());
}