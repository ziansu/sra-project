public static void getParcelable(android.os.Bundle savedInstanceState, com.jparkie.givesmehope.models.Anthology anthology) {
    if (savedInstanceState != null) {
        anthology = savedInstanceState.getParcelable(com.jparkie.givesmehope.models.Anthology.PARCELABLE_KEY);
    }else {
        throw new java.lang.IllegalArgumentException(((com.jparkie.givesmehope.models.Anthology.TAG) + ": \'getParcelable\' Method has null argument: savedInstanceState."));
    }
}