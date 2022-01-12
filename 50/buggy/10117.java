@java.lang.Override
public java.util.List<ru.javawebinar.topjava.model.Meal> getFiltered(int userId, java.time.LocalDate localDateStart, java.time.LocalDate localDateEnd, java.time.LocalTime localTimeStart, java.time.LocalTime localTimeEnd) {
    return repository.getFiltered(userId, localDateStart, localDateEnd, localTimeStart, localTimeEnd);
}