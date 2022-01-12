@java.lang.Override
public org.thoughtcrime.securesms.util.CharacterState calculateCharacters(java.lang.String messageBody) {
    int[] length = android.telephony.SmsMessage.calculateLength(messageBody, false);
    int messagesSpent = length[0];
    int charactersSpent = length[1];
    int charactersRemaining = length[2];
    int maxMessageSize;
    if (messagesSpent > 0) {
        maxMessageSize = (charactersSpent + charactersRemaining) / messagesSpent;
    }else {
        maxMessageSize = charactersSpent + charactersRemaining;
    }
    return new org.thoughtcrime.securesms.util.CharacterState(messagesSpent, charactersRemaining, maxMessageSize);
}