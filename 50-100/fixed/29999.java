@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.widget.RelativeLayout ll = ((android.widget.RelativeLayout) (inflater.inflate(R.layout.fragment_shop, container, false)));
    shopListView = ((android.widget.ListView) (ll.findViewById(R.id.shop_listview)));
    sa = new com.app.game.quizee.ShopFragment.ShopAdapter(getActivity(), com.app.game.quizee.backend.BackEndManager.mes_item);
    shopListView.setAdapter(sa);
    com.app.game.quizee.backend.PlayerManager.getInstance().getCurrentPlayer().addObserver(this);
    return ll;
}