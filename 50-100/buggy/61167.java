public java.lang.String getUserImgUrl(java.lang.Integer userId) {
    try {
        java.util.List<com.vk.api.sdk.objects.users.UserXtrCounters> list = vkApiClient.users().get(getUserActor()).unsafeParam("user_id", list_acc.get(0).getId()).unsafeParam("fields", "photo_400_orig").execute();
        return list.get(0).getPhoto400Orig();
    } catch (com.vk.api.sdk.exceptions.ApiException | com.vk.api.sdk.exceptions.ClientException e) {
        e.printStackTrace();
    }
    return null;
}