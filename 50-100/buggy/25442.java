@java.lang.Override
public void onSuccess(java.util.ArrayList<com.android.slangify.repository.models.PhraseModel> result) {
    if ((result != null) && ((result.size()) > 0)) {
        java.util.Random r = new java.util.Random();
        int randomNumber = (r.nextInt(((result.size()) - 1))) + 1;
        selectdPhrase = result.get(randomNumber);
    }
}