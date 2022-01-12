private java.lang.String toCss(int sentiment) {
    switch (sentiment) {
        case 0 :
            return "Extremly negative";
        case 1 :
            return "Negative";
        case 2 :
            return "Neutral";
        case 3 :
            return "Positive";
        case 4 :
            return "Extremly positive";
        default :
            return "";
    }
}