@java.lang.Override
public void onSuccess(java.lang.Boolean result) {
    if (!result) {
        view.showToast("You must be logged first");
        return ;
    }
    if ((placeController.getWhere()) instanceof mg.rova.gamestore.client.place.AccountPlace)
        return ;
    
    placeController.goTo(new mg.rova.gamestore.client.place.ApplicationListPlace(""));
}