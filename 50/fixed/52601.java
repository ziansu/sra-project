@java.lang.Override
public void onGetListNearbySuccess(java.util.List<com.chatapp.service.models.response.UserModel> userModels) {
    adapter.add(userModels, true);
}