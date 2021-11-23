private java.util.List<cz.zcu.kiv.si.sportbot.dataLoader.enums.Day> getListDay(cz.zcu.kiv.si.sportbot.dataLoader.enums.Day day) {
    java.util.List<cz.zcu.kiv.si.sportbot.dataLoader.enums.Day> list = new java.util.ArrayList<>();
    if (day != null) {
        if (day == (cz.zcu.kiv.si.sportbot.dataLoader.enums.Day.WEEKEND)) {
            list.add(Day.SATURDAY);
            list.add(Day.SUNDAY);
        }else {
            list.add(cz.zcu.kiv.si.sportbot.utils.Utils.getWeekDay(day));
        }
        return list;
    }else {
        list = java.util.Arrays.asList(cz.zcu.kiv.si.sportbot.dataLoader.enums.Day.values());
    }
    return list;
}