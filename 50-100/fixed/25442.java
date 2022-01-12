@java.lang.Override
public void onSuccess(java.util.ArrayList<com.android.slangify.repository.models.PhraseModel> result) {
    if (result != null) {
        if ((result.size()) == 1) {
            selectdPhrase = result.get(0);
        }else
            if ((result.size()) > 1) {
                java.util.Random r = new java.util.Random();
                int randomNumber = (r.nextInt(((result.size()) - 1))) + 1;
                selectdPhrase = result.get(randomNumber);
            }
        
    }
}