@java.lang.Override
public org.wikibrain.core.model.LocalPage transform(org.wikibrain.atlasify.Record r) {
    try {
        return buildLocalPage(r, daoFilter);
    } catch (org.wikibrain.core.dao.DaoException e) {
        org.wikibrain.atlasify.LOG.info(e.getMessage(), e);
        return null;
    }
}