public static java.util.List<com.kupferwerk.kupferriegel.utils.dtw.SimpleDTWModel> buildFromDouble(java.lang.Double... values) {
    java.util.List<com.kupferwerk.kupferriegel.utils.dtw.SimpleDTWModel> model = new java.util.ArrayList<>();
    for (java.lang.Double value : values) {
        model.add(new com.kupferwerk.kupferriegel.utils.dtw.SimpleDTWModel(value));
    }
    return model;
}