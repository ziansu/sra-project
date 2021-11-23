@java.lang.Override
protected void onPostExecute(com.antonpopoff.food.fragments.models.xml.Offers offers) {
    super.onPostExecute(offers);
    if (isViewAttached()) {
        getView().setData(offers);
        getView().showContent();
    }
    this.offers = offers;
}