@java.lang.Override
public java.util.List<org.jasig.portlet.survey.service.jpa.JpaResponse> getResponseByUser(java.lang.String user) {
    java.lang.Iterable<?> responseIter = responseRepository.findByUser(user);
    return org.apache.commons.collections.IteratorUtils.toList(responseIter.iterator());
}