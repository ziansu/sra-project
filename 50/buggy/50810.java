@java.lang.Override
public void onResponse(retrofit2.Call<com.antonpopoff.food.fragments.models.xml.Catalog> call, retrofit2.Response<com.antonpopoff.food.fragments.models.xml.Catalog> response) {
    java.lang.System.out.println("Responce");
    com.antonpopoff.food.fragments.presenters.GoodsFragmentPresenter.AsyncFilter filter = new com.antonpopoff.food.fragments.presenters.GoodsFragmentPresenter.AsyncFilter();
    filter.execute(response.body().getShop().getOffers());
}