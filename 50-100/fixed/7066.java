void setWhys(java.util.List<java.lang.String> whys) {
    getAdvStats().clearWhyTypes();
    if (whys != null) {
        java.util.List<com.brookmanholmes.billiards.turn.AdvStats.WhyType> list = new java.util.ArrayList<>();
        for (java.lang.String why : whys) {
            list.add(convertStringToWhyType(context, why));
        }
        getAdvStats().whyTypes(list);
    }
}