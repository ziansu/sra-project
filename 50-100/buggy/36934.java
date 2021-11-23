@java.lang.Override
public void run() {
    java.util.List<edu.fudan.se.bean.AgentOffer> offerAgents = new edu.fudan.se.dbopration.SelectOfferByMicroTaskOperator(offerTask).getResult();
    java.util.List<edu.fudan.se.bean.AgentOffer> selectedAgent = edu.fudan.se.tfws.CrowdServicePlanner.getSelectedAgent(offerTask.compositeService, offerTask.crowdService, offerTask.cost, offerTask.deadline, offerTask.resultNum, offerTask.longitude, offerTask.latitude, offerAgents);
    new edu.fudan.se.dbopration.UpdateOfferSelectOperator(selectedAgent).getResult();
    informDelegate(selectedAgent);
    informRefuse(offerAgents, selectedAgent);
}