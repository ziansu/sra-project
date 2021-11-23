private java.lang.String toCss(int sentiment) {
    switch (sentiment) {
        case 0 :
            return "Extremly positive";
        case 1 :
            return "Positive";
        case 2 :
            return "Neutral";
        case 3 :
            return "Negative";
        case 4 :
            return "Extremly negative";
        default :
            return "";
    }
}