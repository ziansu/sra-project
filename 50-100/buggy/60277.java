@java.lang.Override
public void action() {
    jade.lang.acl.ACLMessage message = myAgent.receive();
    int performative = message.getPerformative();
    if ((message != null) && (performative == (jade.lang.acl.ACLMessage.REQUEST))) {
        reply(message);
    }else {
        block();
    }
}