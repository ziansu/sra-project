private java.lang.String mapFieldToPersianName(java.lang.String fieldName) {
    switch (fieldName) {
        case "origin" :
            return "مبدا";
        case "destination" :
            return "مقصد";
        case "year" :
            return "سال";
        case "month" :
            return "ماه";
        case "day" :
            return "روز";
        case "duration" :
            return "مدت سفر";
        case "travelType" :
            return "وسیله نقلیه";
        default :
            return "";
    }
}