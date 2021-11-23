@java.lang.Override
public net.sharkfw.knowledgeBase.persistent.sql.SpatialSemanticTag getSpatialSemanticTag(java.lang.String si) throws net.sharkfw.knowledgeBase.persistent.sql.SharkKBException {
    net.sharkfw.knowledgeBase.persistent.sql.SqlSemanticTag tag = new net.sharkfw.knowledgeBase.persistent.sql.SqlSemanticTag(si, getSqlSharkKB());
    try {
        return new net.sharkfw.knowledgeBase.persistent.sql.SqlSpatialSemanticTag(tag);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
        throw new net.sharkfw.knowledgeBase.persistent.sql.SharkKBException();
    }
}