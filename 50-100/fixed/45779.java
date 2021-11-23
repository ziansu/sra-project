@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (okay) {
        java.lang.String p = s.toString();
        boolean disableOkay = false;
        if (p.contains("\n")) {
            p = p.replace("\n", "");
            disableOkay = true;
        }
        lastKnownContents = p;
        if (disableOkay)
            okay = false;
        
    }
}