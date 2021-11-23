public java.lang.String dayNames(int x) {
    int y = x + (counter);
    java.lang.String ret = "";
    switch (y % 7) {
        case 1 :
            ret = "Tuesday: ";
            break;
        case 2 :
            ret = "Wednesday: ";
            break;
        case 3 :
            ret = "Thursday: ";
            break;
        case 4 :
            ret = "Friday: ";
            break;
        case 5 :
            ret = "Saturday: ";
            break;
        case 6 :
            ret = "Sunday: ";
            break;
        case 7 :
            ret = "Monday: ";
    }
    return ret;
}