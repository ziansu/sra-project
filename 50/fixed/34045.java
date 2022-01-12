public play.i18n.Messages preferred(play.mvc.Http.RequestHeader request) {
    play.i18n.Messages msgs = messages.preferred(request);
    return new play.i18n.Messages(new play.i18n.Lang(msgs.lang()), this);
}