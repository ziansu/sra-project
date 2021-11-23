@java.lang.Override
public void onSuccess(java.lang.Integer integer) {
    android.content.SharedPreferences.Editor edit = pref.edit();
    edit.putInt(pro.rgun.akbarstest.repository.vk_wall.VkWallStorageHelper.VK_WALL_ID, integer);
    edit.apply();
    int userId = pref.getInt(pro.rgun.akbarstest.repository.vk_wall.VkWallStorageHelper.VK_USER_ID, 0);
    pro.rgun.akbarstest.repository.vk_wall.VkWallStorageHelper.readFromVkWall(id, userId, new pro.rgun.akbarstest.repository.vk_wall.VkCallback<java.lang.String>() {
        @java.lang.Override
        public void onSuccess(java.lang.String result) {
            callback.onSuccess(result);
        }

        @java.lang.Override
        public void onError(pro.rgun.akbarstest.repository.vk_wall.MyVkError error) {
            callback.onError(error);
        }
    });
}