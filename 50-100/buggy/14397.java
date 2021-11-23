@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.menu_add_contact)) {
        com.bitbudai.fermat_cht_android_sub_app_chat_bitdubai.util.cht_dialog_connections dialog_conn = new com.bitbudai.fermat_cht_android_sub_app_chat_bitdubai.util.cht_dialog_connections(getActivity(), appSession, null, chatManager);
        dialog_conn.show();
        return true;
    }else
        if ((item.getItemId()) == (R.id.menu_switch_profile)) {
            changeActivity(Activities.CHT_CHAT_OPEN_PROFILELIST, appSession.getAppPublicKey());
            return true;
        }
    
    return super.onOptionsItemSelected(item);
}