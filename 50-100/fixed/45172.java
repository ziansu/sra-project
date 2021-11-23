private void checkStateButton(tannt275.babyfood.model.FoodModel foods) {
    deleteImage.setImageResource(((foods.get_admins()) == 1 ? R.mipmap.app_delete_deactive_icon : R.mipmap.app_delete_active_icon));
    deleteImage.setEnabled(((foods.get_admins()) == 2));
    favoriteImage.setImageResource(((foods.get_favorite()) == 1 ? R.mipmap.app_favorite_deactive_icon : R.mipmap.app_favorite_active_icon));
}