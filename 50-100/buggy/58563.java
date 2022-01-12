@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    com.nexb.shopr4.FireBaseController.getI().updateCategoryname(((com.nexb.shopr4.View.ShopListViewCategory) (content)).getCatId(), ((android.widget.EditText) (v.findViewById(R.id.catEditName))).getText().toString());
    return false;
}