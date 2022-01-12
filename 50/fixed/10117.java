@java.lang.Override
public java.util.List<ru.javawebinar.topjava.model.Meal> getFiltered(int userId, java.time.LocalDate localDateStart, java.time.LocalDate localDateEnd) {
    return repository.getFiltered(userId, localDateStart, localDateEnd);
}