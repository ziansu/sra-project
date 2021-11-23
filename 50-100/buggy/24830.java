public void pickupCheck(core.agent.Message message) {
    core.restaurant.Check check = message.get(0);
    synchronized(m_customers) {
        for (core.restaurant.agent.Waiter.CustomerHandler c : m_customers) {
            if ((c.customer) == (check.getCustomer())) {
                c.state = core.restaurant.agent.Waiter.CustomerStateEnum.ReadyToPay;
            }
        }
    }
    print((("Picking " + (check.getCustomer().getName())) + "'s check up from the cashier."));
    stateChanged();
}