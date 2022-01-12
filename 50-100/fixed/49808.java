@java.lang.Override
public void onClick(android.view.View view) {
    if (roleUser.equals("buyer")) {
        java.lang.String idOfProduct = productID.get(position);
        ruc.ps_app_project.FavoriteSingleton.getInstance().saveFavorite(userLoginID, idOfProduct);
    }else {
        android.content.Intent intent = new android.content.Intent(context, ruc.ps_app_project.AskConfirmActivity.class);
        context.startActivity(intent);
    }
}