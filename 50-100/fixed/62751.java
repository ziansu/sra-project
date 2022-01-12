public boolean Validate() {
    java.lang.System.out.println(year);
    java.lang.System.out.println(month);
    java.lang.System.out.println(day);
    java.lang.System.out.println(hour);
    java.lang.System.out.println(minute);
    return (((((year) > 0) && ((month) > 0)) && ((day) > 0)) && ((hour) > 0)) && ((minute) > 0);
}