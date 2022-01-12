public void computeCheck(core.agent.Message message) {
    core.restaurant.agent.Waiter waiter = message.get(0);
    core.restaurant.agent.Customer customer = message.get(1);
    java.lang.String choice = message.get(2);
    m_checks.add(new core.restaurant.Check(waiter, customer, choice));
    print((((("Computing " + (customer.getName())) + "'s check for his/her ") + choice) + "."));
    stateChanged();
}