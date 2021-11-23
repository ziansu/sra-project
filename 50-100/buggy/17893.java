public void madeChoice(core.agent.Message message) {
    core.restaurant.agent.Customer customer = message.get(0);
    synchronized(m_customers) {
        for (core.restaurant.agent.Waiter.CustomerHandler c : m_customers) {
            if ((c.customer) == customer) {
                c.state = core.restaurant.agent.Waiter.CustomerStateEnum.ReadyToOrder;
                break;
            }
        }
    }
    print(((customer.getName()) + " wants to place an order."));
    stateChanged();
}