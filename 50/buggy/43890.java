public com.andrejjj.criminalintent.models.Crime getCrime(java.util.UUID id) {
    com.andrejjj.criminalintent.models.Crime result = null;
    for (com.andrejjj.criminalintent.models.Crime crime : mCrimes) {
        if (id.equals(crime.getId())) {
            result = crime;
            break;
        }
    }
    return result;
}