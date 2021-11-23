@java.lang.Override
public void onClick(android.view.View view) {
    if (isRecipientAdded) {
        pickContact();
    }else {
        addRecipient();
        pickContact();
        isRecipientAdded = true;
    }
}