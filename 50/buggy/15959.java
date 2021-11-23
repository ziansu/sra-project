private play.api.UsefulException throwableToUsefulException(final java.lang.Throwable throwable) {
    return play.api.http.HttpErrorHandlerExceptions.throwableToUsefulException(sourceMapper.sourceMapper(), environment.isProd(), throwable);
}