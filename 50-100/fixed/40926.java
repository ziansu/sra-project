public void placeOrder(core.agent.Message message) {
    core.restaurant.agent.Customer customer = message.get(0);
    java.lang.String choice = message.get(1);
    for (core.restaurant.agent.Waiter.CustomerHandler c : m_customers) {
        if ((c.customer) == customer) {
            c.state = core.restaurant.agent.Waiter.CustomerStateEnum.Ordered;
            c.choice = choice;
            break;
        }
    }
    print(((((customer.getName()) + " chose to order ") + choice) + "."));
    stateChanged();
}