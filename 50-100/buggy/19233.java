private static java.lang.String getUnit(java.lang.String text) {
    switch (text.trim().toLowerCase()) {
        case "days" :
        case "day" :
            return "day:";
        case "months" :
        case "month" :
            return "month:";
        case "years" :
        case "year" :
            return "year";
    }
    return null;
}