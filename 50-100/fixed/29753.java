@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof org.magnum.mobilecloud.video.model.Video) {
        org.magnum.mobilecloud.video.model.Video other = ((org.magnum.mobilecloud.video.model.Video) (obj));
        return ((com.google.common.base.Objects.equal(title, other.title)) && (com.google.common.base.Objects.equal(owner, other.owner))) && ((duration) == (other.duration));
    }else {
        return false;
    }
}