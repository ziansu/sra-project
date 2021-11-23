public java.util.List<GoAberDatabase.ActivityData> findAllForUserWithUnit(GoAberDatabase.User user, java.lang.String unit) {
    return findAllForUserWithUnit(user.getIdUser(), unit);
}