@java.lang.Override
public void onClick(android.view.View v) {
    readTextFromEditText();
    isAllValid();
    if (isAllValid()) {
        com.example.a2017.mentoring.Model.Register register = new com.example.a2017.mentoring.Model.Register(_email, _first_password, _first_name, _last_name, _type, _phone_number);
        sendRegisterToServer(register);
    }
}