@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d(com.pokemonshowdown.app.BattleFragment.BTAG, "onPause");
    com.pokemonshowdown.data.BattleFieldData.RoomData roomData = com.pokemonshowdown.data.BattleFieldData.get(getActivity()).getAnimationInstance(mRoomId);
    if (roomData != null) {
        roomData.setMessageListener(true);
        if (((mAnimatorSetQueue) != null) && ((mAnimatorSetQueue.peekFirst()) != null)) {
            mAnimatorSetQueue.peekFirst().end();
        }
        roomData.setViewBundle(saveViewBundle());
    }
}