public java.lang.String getDateTimeDisplay(shared.CustomTime cTime) {
    assert cTime != null;
    java.lang.String display = getDateDisplay(cTime);
    java.lang.System.out.println(display);
    java.lang.System.out.println(cTime.hasTime());
    if (display.isEmpty()) {
        if (cTime.hasTime()) {
            display = getTimeDisplay(cTime);
        }
    }else {
        if (cTime.hasTime()) {
            display = (display + " ") + (getTimeDisplay(cTime));
        }
    }
    return display;
}