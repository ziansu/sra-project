@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    if (((!(com.jobviewer.util.Utils.isNullOrEmpty(top_man_edittext.getText().toString()))) && (!(com.jobviewer.util.Utils.isNullOrEmpty(bottom_man1_edittext.getText().toString())))) && (!(com.jobviewer.util.Utils.isNullOrEmpty(bottom_man2_edittext.getText().toString())))) {
        enableNextButton(true);
    }
}