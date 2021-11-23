@java.lang.Override
public void onItemClickListener(com.bitdubai.fermat_cht_api.layer.sup_app_module.interfaces.chat_actor_community.interfaces.ChatActorCommunityInformation data, int position) {
    try {
        android.widget.Toast.makeText(getActivity(), "TODO ACCEPT ->", Toast.LENGTH_LONG).show();
        com.bitdubai.sub_app.chat_community.common.popups.AcceptDialog notificationAcceptDialog = new com.bitdubai.sub_app.chat_community.common.popups.AcceptDialog(getActivity(), appSession, null, data, moduleManager.getSelectedActorIdentity());
        notificationAcceptDialog.setOnDismissListener(this);
        notificationAcceptDialog.show();
    } catch (com.bitdubai.fermat_api.layer.modules.exceptions.CantGetSelectedActorIdentityException | com.bitdubai.fermat_api.layer.modules.exceptions.ActorIdentityNotSelectedException e) {
        e.printStackTrace();
        android.widget.Toast.makeText(getActivity(), "TODO ACCEPT but.. ERROR! ->", Toast.LENGTH_LONG).show();
    }
}