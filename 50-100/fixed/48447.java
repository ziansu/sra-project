@java.lang.Override
public void visitAvatar(com.vengeful.sloths.Models.Entity.Avatar avatar) {
    com.vengeful.sloths.AreaView.ViewObjects.AvatarViewObject avo = factory.createAvatarViewObject(avatar.getLocation().getR(), avatar.getLocation().getS(), "resources/entities/smasher/");
    new com.vengeful.sloths.View.Observers.ProxyEntityObserver(avo, avatar);
    avo.registerObserver(activeCameraView);
    com.vengeful.sloths.AreaView.AvatarViewFollower.getInstance().bindToViewObject(avo);
    activeCameraView.addAvatar(avo);
}