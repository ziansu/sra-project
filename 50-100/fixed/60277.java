@java.lang.Override
public void action() {
    jade.lang.acl.ACLMessage message = null;
    if ((message = myAgent.receive()) != null) {
        int performative = message.getPerformative();
        switch (performative) {
            case jade.lang.acl.ACLMessage.REQUEST :
                reply(message);
        }
    }else {
        block();
    }
}