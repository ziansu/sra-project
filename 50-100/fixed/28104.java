private void setInputValues() {
    android.os.Bundle args = getArguments();
    try {
        userName.setText(args.getString("username"));
        contact1.setText(args.getString("contact1"));
        contact2.setText(args.getString("contact2"));
    } catch (java.lang.Exception e) {
    }
}