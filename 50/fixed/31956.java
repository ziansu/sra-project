public int addPoint(com.curriculum.domain.KnowledgePoint knowledgePoint) {
    int num = knowledgePointDao.addPoint(knowledgePoint);
    return num;
}