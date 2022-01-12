private void dispatchToGame(android.support.v4.app.FragmentActivity activity, com.pajato.android.gamechat.common.FragmentType type) {
    if ((this.type) != (com.pajato.android.gamechat.common.FragmentType.noExperiences)) {
        com.pajato.android.gamechat.common.Dispatcher dispatcher = new com.pajato.android.gamechat.common.Dispatcher(getNextType(type), type.expType);
        DispatchManager.instance.chainFragment(activity, dispatcher);
    }else {
        com.pajato.android.gamechat.common.Dispatcher dispatcher = new com.pajato.android.gamechat.common.Dispatcher(com.pajato.android.gamechat.common.FragmentType.expGroupList, type.expType);
        DispatchManager.instance.startNextFragment(activity, dispatcher);
    }
}