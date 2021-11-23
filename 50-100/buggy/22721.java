public java.lang.String getColor() {
    java.lang.String color;
    switch (acca.getOverallQuality()) {
        case "VERY BAD" :
            color = "#FF0000";
            break;
        case "BAD" :
            color = "#FFFF00";
            break;
        case "GOOD" :
            color = "#00FF00";
            break;
        case "VERY GOOD" :
            color = "#00FF00";
            break;
        case "EXCELLENT" :
            color = "#00FF7F";
            break;
        default :
            color = "";
            break;
    }
    return color;
}