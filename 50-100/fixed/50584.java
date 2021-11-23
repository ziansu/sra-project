protected void handleInform(jade.lang.acl.ACLMessage inform) {
    try {
        Behaviour.CustomerOrder order = ((Behaviour.CustomerOrder) (inform.getContentObject()));
        if (order != null) {
            orderList.remove(order);
            java.lang.System.out.println((((((myAgent.getLocalName()) + " : Agent: ") + (inform.getSender().getLocalName())) + " successfully processed the order: ") + (order.getOrder())));
        }
    } catch (jade.lang.acl.UnreadableException e) {
        e.printStackTrace();
    }
}