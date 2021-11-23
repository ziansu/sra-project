public java.lang.String AsString() {
    java.lang.String ic = "";
    java.lang.String cl = "";
    for (com.example.facebook.insighting.InsightCard i : cards) {
        ic += i.AsString();
    }
    for (java.lang.String c : categoriesList) {
        cl += c + "ᔦ";
    }
    return ((((((((projectID) + "|") + (projectDescription)) + "|") + (projectName)) + "|") + ic) + "|") + cl;
}