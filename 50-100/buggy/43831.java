public void removeUser(com.jclolstorm.lolstorm.models.User toRemove) {
    for (com.jclolstorm.lolstorm.models.User user : users) {
        if ((user.getName().equals(toRemove.getName())) && ((user.getRegionId()) == (lolstormSDK.RiotEndpoint.getInstance().getRegionId()))) {
            users.remove(user);
            savedSummonerList.updateSavedUsers(users);
            return ;
        }
    }
}