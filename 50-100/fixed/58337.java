private void setPedagogicalUsesTreeRoot(eu.ueb.acem.domain.beans.jaune.ResourceCategory resourceCategory) {
    eu.ueb.acem.web.controllers.MyToolsController.logger.debug("Entering setPedagogicalUsesTreeRoot");
    pedagogicalUsesTreeBean = pedagogicalAdviceTreeGenerator.createNeedAndAnswersTree(null);
    java.util.Set<java.lang.Long> idsOfLeavesToKeep = new java.util.HashSet<java.lang.Long>();
    for (eu.ueb.acem.domain.beans.bleu.PedagogicalAnswer answer : resourceCategory.getAnswers()) {
        idsOfLeavesToKeep.add(answer.getId());
    }
    pedagogicalUsesTreeBean.retainLeavesAndParents(idsOfLeavesToKeep);
    eu.ueb.acem.web.controllers.MyToolsController.logger.debug("Leaving setPedagogicalUsesTreeRoot");
}