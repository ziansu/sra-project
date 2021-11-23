public static com.andrejjj.criminalintent.models.CrimeLab get(android.content.Context context) {
    if ((com.andrejjj.criminalintent.models.CrimeLab.sCrimeLab) == null) {
        return new com.andrejjj.criminalintent.models.CrimeLab(context);
    }else {
        return com.andrejjj.criminalintent.models.CrimeLab.sCrimeLab;
    }
}