public void setCookingDay(ru.spbau.mit.foodmanager.Day day, java.lang.Boolean isCookingDay, android.content.Context c) {
    this.isCookingDay.put(day, isCookingDay);
    ru.spbau.mit.foodmanager.MenuSettings.saveMenuSettings(c);
}