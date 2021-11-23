public static java.util.List<java.lang.Integer> getKeysByGender() {
    java.util.List<java.lang.Integer> genders = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 0; i < (com.worksap.stm2016.utils.CommonUtils.GENDERS); ++i) {
        genders.add(i);
    }
    return genders;
}