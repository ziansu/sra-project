@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    if (m_Type.equals(org.spinsuite.view.T_DynamicTab.RECORD_SAVE)) {
        if (is_OK) {
            refreshIndex();
            m_IsLoadDataOk = refresh(mGridTab.getKeys(), mGridTab.getKeyColumns(), false);
            lockView(org.spinsuite.view.T_DynamicTab.SEE);
        }else {
            org.spinsuite.util.Msg.alertMsg(getActivity(), mGridTab.getError());
        }
    }
    v_PDialog.dismiss();
}