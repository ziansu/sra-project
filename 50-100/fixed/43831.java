public void removeUser(com.jclolstorm.lolstorm.models.User toRemove) {
    java.lang.System.out.println(users.size());
    for (com.jclolstorm.lolstorm.models.User user : users) {
        if ((user.getName().equals(toRemove.getName())) && ((user.getRegionId()) == (toRemove.getRegionId()))) {
            users.remove(user);
            savedSummonerList.updateSavedUsers(users);
            return ;
        }
    }
    java.lang.System.out.println(users.size());
}