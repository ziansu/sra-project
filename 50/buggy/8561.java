@java.lang.Override
public ru.javawebinar.topjava.model.User save(ru.javawebinar.topjava.model.User user) {
    checkModificationAllowed(user.getId());
    return proxy.save(user);
}