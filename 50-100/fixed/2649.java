private void handleSession(net.cattweasel.pokebot.api.PokeContext context, net.cattweasel.pokebot.object.BotSession session, net.cattweasel.pokebot.tools.GeoLocation loc) {
    if ((((session.getUser().getSettings()) == null) || ((session.getUser().getSettings().get(net.cattweasel.pokebot.task.UserNotificationTask.ARG_GYM_ENABLED)) == null)) || (net.cattweasel.pokebot.tools.Util.otob(session.getUser().getSettings().get(net.cattweasel.pokebot.task.UserNotificationTask.ARG_GYM_ENABLED)))) {
        handleGyms(context, session, loc);
    }
    handleSpawns(context, session, loc);
}