private void setUpHelpChat(boolean checkButton) {
    try {
        presentationDialog = new com.bitdubai.fermat_android_api.ui.Views.PresentationDialog.Builder(getActivity(), appSession).setTemplateType(PresentationDialog.TemplateType.TYPE_PRESENTATION_WITHOUT_IDENTITIES).setBannerRes(R.drawable.cht_banner).setIconRes(R.drawable.chat_subapp).setSubTitle(R.string.cht_chat_subtitle).setBody(R.string.cht_chat_body).setTextFooter(R.string.cht_chat_footer).setIsCheckEnabled(false).build();
        presentationDialog.show();
    } catch (java.lang.Exception e) {
        errorManager.reportUnexpectedSubAppException(SubApps.CHT_CHAT, UnexpectedSubAppExceptionSeverity.DISABLES_SOME_FUNCTIONALITY_WITHIN_THIS_FRAGMENT, e);
    }
}