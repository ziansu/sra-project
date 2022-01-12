public static com.jparkie.givesmehope.models.Anthology getParcelable(android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        return savedInstanceState.getParcelable(com.jparkie.givesmehope.models.Anthology.PARCELABLE_KEY);
    }else {
        throw new java.lang.IllegalArgumentException(((com.jparkie.givesmehope.models.Anthology.TAG) + ": \'getParcelable\' Method has null argument: savedInstanceState."));
    }
}