public com.msiops.ground.either.Either<sample.auth.models.User, java.util.List<sample.auth.models.ErrorResponse>> loadUser(java.lang.String login) {
    final sample.auth.models.User loaded = userDAO.load(login);
    java.util.ArrayList<sample.auth.models.ErrorResponse> errors = new java.util.ArrayList<>();
    if (loaded != null) {
        return com.msiops.ground.either.Either.left(loaded);
    }
    errors.add(new sample.auth.models.ErrorResponse("Incorrect login", sample.auth.ErrorState.FORBIDDEN));
    return com.msiops.ground.either.Either.right(errors);
}