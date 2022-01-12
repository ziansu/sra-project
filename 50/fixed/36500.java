@java.lang.Override
public void updateQueryDocumentRelevance(com.silicolife.textmining.core.interfaces.core.document.IPublication publication, com.silicolife.textmining.core.interfaces.process.IR.IQuery query, com.silicolife.textmining.core.interfaces.core.document.relevance.IQueryPublicationRelevance relevance) throws com.silicolife.textmining.core.interfaces.core.dataaccess.exception.ANoteException {
    queryAccessImpl.updateRelevance(publication.getId(), query.getId(), relevance.getRelevance().toString());
}