@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public void onPostExecute(java.lang.Object... result) {
    activeIdentity = null;
    if ((result != null) && ((result.length) > 0)) {
        progressDialog.dismiss();
        if ((((getContext()) != null) && ((navPainter) == null)) && ((activeIdentity) == null)) {
            activeIdentity = ((com.bitdubai.fermat_cht_api.layer.sup_app_module.interfaces.chat_actor_community.interfaces.ChatActorCommunitySelectableIdentity) (result[0]));
            getNavigationViewPainter();
        }
    }else
        activeIdentity = null;
    
}