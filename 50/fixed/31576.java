@java.lang.Override
public net.sharkfw.knowledgeBase.persistent.sql.SemanticTag getSemanticTag(java.lang.String si) throws net.sharkfw.knowledgeBase.persistent.sql.SharkKBException {
    return new net.sharkfw.knowledgeBase.persistent.sql.SqlSemanticTag(si, sqlSharkKB);
}