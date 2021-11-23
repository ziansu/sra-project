private static void updateDateByRate(java.util.Calendar calendar, int rate) {
    if ((rate - (seedu.address.model.item.DateTime.INTEGER_CONSTANT_ONE)) > (seedu.address.model.item.DateTime.INTEGER_CONSTANT_ZERO)) {
        calendar.add(java.util.Calendar.DATE, ((rate - (seedu.address.model.item.DateTime.INTEGER_CONSTANT_ONE)) * (seedu.address.model.item.DateTime.NUMBER_OF_DAYS_IN_A_WEEK)));
    }
}