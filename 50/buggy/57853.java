public java.util.List<GoAberDatabase.ActivityData> findAllForUserWithUnit(GoAberDatabase.User user, java.lang.String unit) {
    return getFacade().getAllForUserWithUnit(user.getIdUser(), unit);
}