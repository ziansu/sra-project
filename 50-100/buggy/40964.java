public static classscheduling.Course forCode(char c) {
    switch (c) {
        case 'M' :
            return classscheduling.Course.MATH;
        case 'E' :
            return classscheduling.Course.ENGLISH;
        case 'F' :
            return classscheduling.Course.FRENCH;
        case 'G' :
            return classscheduling.Course.GEOGRAPHY;
        case 'A' :
            return classscheduling.Course.ART;
        case 'U' :
            return classscheduling.Course.MUSIC;
        default :
            return null;
    }
}