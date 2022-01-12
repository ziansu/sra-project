@java.lang.Override
public void accept(prada.lab.android.pingo.model.PingoPlace place) throws java.lang.Exception {
    binding.setVm(new prada.lab.android.pingo.viewmodel.PlaceViewModel(place));
    othersAdapter.setTags(place.getTags(PingoPlace.TAG_NON_OTHERS));
    java.util.List<prada.lab.android.pingo.model.Tag> categories = new java.util.ArrayList<>();
    categories.add(prada.lab.android.pingo.model.Tag.createCategoryTag(getString(R.string.category_food), PingoPlace.CATEGORY_RESTAURANT));
    categories.add(prada.lab.android.pingo.model.Tag.createCategoryTag(getString(R.string.category_attraction), PingoPlace.CATEGORY_ATTRACTION));
    categoryAdapter.setTags(place.getCategoryType(), categories);
}