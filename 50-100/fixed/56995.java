public static com.kupferwerk.kupferriegel.utils.dtw.SimpleDTWModel[] buildFromDouble(java.lang.Double... values) {
    final com.kupferwerk.kupferriegel.utils.dtw.SimpleDTWModel[] model = new com.kupferwerk.kupferriegel.utils.dtw.SimpleDTWModel[values.length];
    for (int i = 0; i < (values.length); i++) {
        model[i] = new com.kupferwerk.kupferriegel.utils.dtw.SimpleDTWModel(values[i]);
    }
    return model;
}