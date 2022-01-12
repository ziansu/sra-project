private java.lang.String parseInterpretation(java.lang.String value) {
    java.lang.String interpretation = "";
    switch (value) {
        case "pathogenic" :
            interpretation = "Pathogenic";
            break;
        case "likely_pathogenic" :
            interpretation = "Likely Pathogenic";
            break;
        case "likely_benign" :
            interpretation = "Likely Benign";
            break;
        case "benign" :
            interpretation = "Benign";
            break;
        default :
            interpretation = "Variant of Unknown Significance";
            break;
    }
    return interpretation;
}