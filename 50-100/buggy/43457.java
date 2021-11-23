public java.lang.String getDay() {
    switch (day) {
        case "Mon" :
            day = "Понедельник";
            break;
        case "Tue" :
            day = "Вторник";
            break;
        case "Wed" :
            day = "Среда";
            break;
        case "Thu" :
            day = "Четверг";
            break;
        case "Fri" :
            day = "Пятница";
            break;
        case "Sat" :
            day = "Суббота";
            break;
        case "Sun" :
            day = "Воскресенье";
            break;
        default :
            day = "Ошибка";
            break;
    }
    return day;
}