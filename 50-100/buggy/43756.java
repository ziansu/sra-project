public boolean validLoginGuard() {
    double ran = java.lang.Math.random();
    if ((((user) != null) && ((user.getAttempts()) == 2)) || ((ran > 0.25) && (getState().equals(States.Login)))) {
        return true;
    }else {
        return false;
    }
}