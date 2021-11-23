private void loadUserRequest() {
    new com.example.celien.drivemycar.http.HttpAsyncNotif(this).execute(user.getUsername());
}