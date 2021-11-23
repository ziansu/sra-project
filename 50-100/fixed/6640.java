void reload() {
    if (mActivity.TWO_PLAYER_GAME()) {
        if (((mPlayerButtonList) == null) || ((mPlayerButtonList.size()) == 0)) {
            createButtonsPlayerList();
        }else {
            for (int i = 0; i < (mActivity.game.size()); i++) {
                mPlayerButtonList.get(i).reload(mActivity.game.getPlayer(i));
            }
        }
    }
}