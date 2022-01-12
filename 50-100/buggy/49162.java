public void bindData(com.padc.recipes.data.vos.MostPopularRecipeVO mostPopularRecipe) {
    mMostPopularRecipe = mostPopularRecipe;
    tvRecommendedFoods.setText(mostPopularRecipe.getRecipe_name());
    java.lang.String imageUrl = (com.padc.recipes.utils.RecipeAppConstants.IMAGE_ROOT_DIR) + (mostPopularRecipe.getPhotos());
    com.bumptech.glide.Glide.with(ivRecommendedFood.getContext()).load(imageUrl).centerCrop().placeholder(R.drawable.stock_photo_placeholder).error(R.drawable.stock_photo_placeholder).into(ivRecommendedFood);
}