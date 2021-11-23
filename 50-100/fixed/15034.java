@java.lang.Override
public void onListItemClick(android.widget.ListView l, android.view.View v, int position, long id) {
    if (position == 0) {
        return ;
    }
    bbct.android.common.data.BaseballCard card = this.adapter.getItem((position - 1));
    android.support.v4.app.Fragment details = bbct.android.common.activity.BaseballCardDetails.getInstance(id, card);
    this.getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_holder, details).addToBackStack(bbct.android.common.activity.BaseballCardList.EDIT_CARD).commit();
}