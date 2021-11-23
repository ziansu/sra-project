@java.lang.Override
public pt.uc.dei.aor.project.business.model.IPublicationChannel save(pt.uc.dei.aor.project.business.model.IPublicationChannel publicationChannel) {
    pt.uc.dei.aor.project.persistence.entity.PublicationChannelEntity pcEntity = getEntity(publicationChannel);
    pcEntity = em.merge(pcEntity);
    return new pt.uc.dei.aor.project.persistence.proxy.PublicationChannelProxy(pcEntity);
}