public com.msiops.ground.either.Either<sample.auth.models.User, java.util.List<sample.auth.models.ErrorResponse>> loadUser(java.lang.String login) {
    final sample.auth.models.User loaded = userDAO.load(login);
    if (loaded != null) {
        return com.msiops.ground.either.Either.left(loaded);
    }
    final java.util.List<sample.auth.models.ErrorResponse> errors = new java.util.ArrayList<>();
    errors.add(new sample.auth.models.ErrorResponse("Incorrect login", sample.auth.ErrorState.FORBIDDEN));
    return com.msiops.ground.either.Either.right(errors);
}