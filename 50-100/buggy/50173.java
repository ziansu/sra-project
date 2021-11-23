@java.lang.Override
public android.view.View onCreateInputView() {
    super.onCreateInputView();
    kv = ((android.inputmethodservice.KeyboardView) (getLayoutInflater().inflate(R.layout.keyboard, null)));
    keyboard = new android.inputmethodservice.Keyboard(this, R.xml.qwerty);
    kv.setKeyboard(keyboard);
    kv.setOnKeyboardActionListener(this);
    analyzer = new com.example.mobile.typinganalyzer.KeyboardAnalyzer(this.getApplicationContext());
    android.util.Log.i("create", "creating keyboard");
    android.widget.Toast.makeText(this, "creating keyboard", Toast.LENGTH_SHORT).show();
    return kv;
}