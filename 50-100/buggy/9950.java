public boolean checkAvailability(int position, java.lang.String posis) {
    if (map1[position].equals(posis)) {
        return true;
    }
    switch (map1[position]) {
        case "d" :
            return false;
        case "e" :
            return false;
        case "f" :
            return false;
        case "g" :
            return false;
        case "h" :
            return false;
        case "i" :
            return false;
        case "3" :
            return false;
        case "5" :
            return false;
        default :
            return true;
    }
}