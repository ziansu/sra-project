public void enable(yuown.yuventory.model.UserModel user) {
    if (null != user) {
        yuown.yuventory.model.UserModel fromDB = transformer().transformTo(userRepositoryService.findByUsername(user.getUsername()));
        if ((null != fromDB) && ((user.isEnabled()) != (fromDB.isEnabled()))) {
            fromDB.setEnabled(user.isEnabled());
            userRepositoryService.save(transformer().transformFrom(fromDB));
        }
    }
}