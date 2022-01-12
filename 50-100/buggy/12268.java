private void resetConfirmation() {
    if ((confirmation) != null) {
        getSupportFragmentManager().beginTransaction().remove(confirmation).commit();
        confirmation = null;
        getAllCar();
        new it.familiyparking.app.task.AsyncTaskGCM().execute(user, this);
    }
}