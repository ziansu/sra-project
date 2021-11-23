@java.lang.Override
public void educateKnowledge(double[][] knowledges, ua.kh.khpi.alex_babenko.art.entity.Knowledge knowledge) {
    ua.kh.khpi.alex_babenko.art.service.DefaultKnowledgeService.LOG.debug("Start network education");
    while (needNewEra(knowledge)) {
        ua.kh.khpi.alex_babenko.art.service.DefaultKnowledgeService.LOG.debug(("Need new era: " + (needNewEra(knowledge))));
        knowledge.setbCopy(arrayService.createCopy(knowledge.getB()));
        knowledge.settCopy(arrayService.createCopy(knowledge.getT()));
        startEraForKnowledge(knowledges, knowledge);
    } 
    ua.kh.khpi.alex_babenko.art.service.DefaultKnowledgeService.LOG.debug("Finish network education");
}