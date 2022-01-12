private boolean messageGood(java.lang.String message) {
    if (message.isEmpty()) {
        contact_us_message_editText.setError(getString(R.string.message_empty_error));
        return false;
    }else
        if ((message.length()) < 10) {
            contact_us_message_editText.setError("Message too short, please add more details");
            return false;
        }else
            return true;
        
    
}