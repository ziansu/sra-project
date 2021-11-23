@java.lang.Override
public void user(io.apiman.manager.api.beans.idm.UserBean user) {
    try {
        logger.info(((Messages.i18n.format("StorageImportDispatcher.ImportingUser")) + (user.getUsername())));
        io.apiman.manager.api.beans.idm.UserBean userBean = storage.getUser(user.getUsername());
        if (userBean == null) {
            storage.createUser(user);
        }else {
            storage.updateUser(user);
        }
    } catch (io.apiman.manager.api.core.exceptions.StorageException e) {
        error(e);
    }
}