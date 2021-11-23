@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((mValidator) == null)
        return ;
    
    if (mValidator.validateField(s.toString())) {
        bOk.setEnabled(true);
        textMessage.setText("");
    }else {
        bOk.setEnabled(false);
        if (!(s.toString().isEmpty()))
            textMessage.setText(R.string.existing_local_folder_name);
        
    }
}