private void applyAndAnimateRemovals(java.util.List<hk.ust.cse.hunkim.questionroom.BaseActivity.RoomInfo> roomInfos) {
    for (int i = (roomInfoList.size()) - 1; i >= 0; i--) {
        final hk.ust.cse.hunkim.questionroom.BaseActivity.RoomInfo roomInfo = roomInfoList.get(i);
        if (!(roomInfos.contains(roomInfo))) {
            removeItem(i);
        }
    }
}