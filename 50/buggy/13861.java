private void setupCheckInData() {
    syncCheckInRequestDTO = new com.ets.gd.NetworkLayer.RequestDTOs.SyncCheckInRequestDTO(com.ets.gd.Constants.Constants.RESPONSE_SYNC_POST_CHECKIN, checkInList);
    if (0 != (checkInList.size())) {
        sendCheckInCall = true;
    }
}