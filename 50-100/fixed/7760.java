public void payForMeal(core.agent.Message message) {
    core.restaurant.agent.Customer customer = message.get(0);
    float amountPaid = message.get(1);
    float cost = 0;
    for (core.restaurant.Check c : m_checks) {
        if ((c.getCustomer()) == customer) {
            c.setStatus(CheckStatusEnum.Received);
            c.setChange((amountPaid - cost));
        }
    }
    print(((customer.getName()) + " is paying for his/her meal."));
    stateChanged();
}