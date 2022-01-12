private void saveUser(com.jclolstorm.lolstorm.models.User newUser) {
    for (com.jclolstorm.lolstorm.models.User user : users) {
        if ((user.getName().equals(newUser.getName())) && ((user.getRegionId()) == (newUser.getRegionId()))) {
            return ;
        }
    }
    users.add(0, newUser);
    savedSummonerList.updateSavedUsers(users);
}