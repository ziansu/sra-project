public void leaveApartment(com.parse.SaveCallback callback) {
    remove("apartment");
    if (callback == null)
        saveInBackground();
    else
        saveInBackground(callback);
    
    Model.Managers.PushNotifsManager.getInstance().unsubscribeFromApartment();
}