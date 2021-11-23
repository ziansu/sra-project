private boolean fetchAndLoadFriendFile(com.posn.datatypes.Friend friend) throws com.posn.exceptions.POSNCryptoException, java.io.IOException, org.json.JSONException {
    java.lang.String fileName = (friend.ID) + "_friend_user_file.txt";
    java.lang.String deviceFilepath = com.posn.constants.Constants.wallFilePath;
    com.posn.managers.DeviceFileManager.downloadFileFromURL(friend.friendFileLink, deviceFilepath, fileName);
    return dataManager.loadFriendFile(friend.ID, deviceFilepath, fileName);
}