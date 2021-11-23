private java.util.List<java.lang.String> getTranslation() {
    java.util.List<java.lang.String> translationList = new java.util.ArrayList<>(1);
    java.lang.String[] translation = translationResult.replace("[", "").split("\",");
    translationList.add(translation[0].replace("\"", ""));
    return translationList;
}