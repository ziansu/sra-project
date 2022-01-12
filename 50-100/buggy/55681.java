@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((ownNameSubscription) != null)
        ownNameSubscription.unsubscribe();
    
    if ((preferredNicknameSubscription) != null)
        preferredNicknameSubscription.unsubscribe();
    
    nicknameEdit.setError(sneer.android.SneerAndroidSingleton.sneer().problemWithNewNickname(party.publicKey().current(), editText.getText().toString()));
}