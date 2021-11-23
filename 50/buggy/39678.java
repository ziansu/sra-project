public void leaveApartment(com.parse.SaveCallback callback) {
    remove("apartment");
    saveInBackground(callback);
    Model.Managers.PushNotifsManager.getInstance().unsubscribeFromApartment();
}