@java.lang.Override
public org.silverpeas.core.contribution.contentcontainer.content.GlobalSilverContent getGlobalSilverContent(org.silverpeas.core.contribution.contentcontainer.content.SilverContentInterface sci, org.silverpeas.core.admin.user.model.UserDetail creatorDetail, java.lang.String location) {
    org.silverpeas.core.contribution.contentcontainer.content.GlobalSilverContent gsc = super.getGlobalSilverContent(sci, creatorDetail, location);
    org.silverpeas.components.gallery.model.Media media = ((org.silverpeas.components.gallery.model.Media) (sci));
    gsc.setThumbnailURL(media.getApplicationThumbnailUrl(MediaResolution.TINY));
    gsc.setType(media.getType().getName());
    return gsc;
}