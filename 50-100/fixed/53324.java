@java.lang.Override
public void insertNewPlayer(core.model.Player player) throws core.model.PlayerException, java.lang.RuntimeException {
    java.util.Date currentDate = core.utils.DateUtils.getCurrentDate();
    player.setLastEnterence(currentDate);
    player.setRegistrationDate(currentDate);
    if (!(isPlayerValidForRegistration(player))) {
        throw new core.model.PlayerException("the data is not valid for registration");
    }else {
        playerDao.insertPlayer(player);
    }
}