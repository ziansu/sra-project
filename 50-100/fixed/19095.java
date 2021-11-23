@java.lang.Override
public void handleMessage(android.os.Message msg) {
    Marketitems = ((java.util.ArrayList<edu.temple.tuhub.models.Marketitem>) (msg.obj));
    if ((getActivity()) != null) {
        arraymarket = new edu.temple.tuhub.MarketAdapter(getActivity().getApplicationContext(), R.layout.marketperitem, Marketitems);
    }
    marketgrid.setAdapter(arraymarket);
}