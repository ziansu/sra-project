public void doJob() {
    for (java.lang.Object socialUser : models.SocialUser.findAll()) {
        models.MessageCenter messageCenter = new models.MessageCenter(((models.SocialUser) (socialUser)));
        messageCenter.save();
    }
}