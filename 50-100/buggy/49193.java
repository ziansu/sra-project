private java.lang.String getUserInfo(java.lang.String name) {
    java.lang.String content = socketClient.request("getUserInformation", name);
    java.lang.String[] information = content.split("-");
    java.lang.String[] genresSep = information[1].split("_");
    java.lang.String userInformation = "Your information:\r\n";
    for (int i = 0; i < (genresSep.length); i++) {
        userInformation += (genresSep[i]) + "\n";
    }
    return userInformation;
}