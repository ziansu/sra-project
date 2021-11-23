@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    com.nexb.shopr4.FireBaseController.getI().setActiveShopListName(((android.widget.EditText) (v.findViewById(R.id.listNameEdit))).getText().toString());
    return false;
}