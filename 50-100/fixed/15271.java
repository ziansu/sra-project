@java.lang.Override
public void subscribe(ru.journaltrack.domain.form.UserSubscribeForm form) {
    ru.journaltrack.domain.db.User user = userRepository.findByUsername(form.getUsername()).get();
    ru.journaltrack.domain.db.Order order = orderService.findOne(form.getOrderId());
    user.getOrders().add(order);
    order.getUsers().add(user);
    userRepository.save(user);
}