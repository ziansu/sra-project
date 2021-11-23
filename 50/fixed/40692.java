public java.util.List<com.curriculum.domain.KnowledgePoint> getPointsByKnowledgeId(int knowledgeId) {
    java.util.List knowledgePointList = knowledgePointDao.getPointsByKnowledgeId(java.lang.Integer.valueOf(knowledgeId));
    return knowledgePointList == null ? java.util.Collections.emptyList() : knowledgePointList;
}