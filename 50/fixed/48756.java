@java.lang.Override
public java.util.List<ru.javawebinar.topjava.model.User> getAll() {
    return crudRepository.findAll();
}