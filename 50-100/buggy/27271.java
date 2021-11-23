@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    if (((((context.frag_productlist_listview.getLastVisiblePosition()) + 1) == totalItemCount) && ((context.frag_productlist_listview.getAdapter().getCount()) >= (com.mercadopago.mpofertas.AppConstants.SIZE_LIST))) && ((context.lastLoadCount) == (com.mercadopago.mpofertas.AppConstants.SIZE_LIST)))
        context.createNewLoader();
    
}