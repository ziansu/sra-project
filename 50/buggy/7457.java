public play.libs.F.Promise<play.mvc.Result> onError(play.mvc.Http.RequestHeader request, java.lang.Throwable t) {
    return F.Promise.<play.mvc.Result>pure(play.mvc.Results.internalServerError(views.html.error500.render()));
}