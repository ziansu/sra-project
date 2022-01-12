@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_shop_payment, container, false);
    butterknife.ButterKnife.bind(this, view);
    context = getContext();
    shopPaymentPresenter = new com.codenicely.discountstore.project_new.shop_admin.payment_shop.presenter.ShopPaymentPresenterImpl(new com.codenicely.discountstore.project_new.shop_admin.payment_shop.model.RetrofitPaymentShopProvider(), this);
    sharedPrefs = new com.codenicely.discountstore.project_new.helper.SharedPrefs(getContext());
    shopOfferListFragment = new com.codenicely.discountstore.project_new.shop_admin.shop_offerlist.view.ShopOfferListFragment();
    shopPaymentPresenter.requestShopPaymentHash(id, sharedPrefs.getKeyAccessTokenShop());
    return view;
}