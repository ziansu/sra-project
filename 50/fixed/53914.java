@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    pes.twochange.domain.themes.AdTheme.getInstance().remove(username, wantedProducts.get(position).getId());
    wantedProducts = null;
    loadProductList();
}