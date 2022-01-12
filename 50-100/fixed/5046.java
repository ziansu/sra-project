public void updatePetName() {
    de.uni_freiburg.informatik.es.cigtrack.UserData u = new de.uni_freiburg.informatik.es.cigtrack.UserData(this);
    java.lang.String petname = u.readCOL_5Data();
    android.widget.TextView txt_head = ((android.widget.TextView) (findViewById(R.id.text_header)));
    java.lang.String message = getResources().getString(R.string.text_petName, petname, petname);
    txt_head.setText(message);
}