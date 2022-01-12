public android.os.Bundle createBundle() {
    android.os.Bundle args = new android.os.Bundle();
    args.putString("username", userName.getText().toString());
    args.putString("contact1", contact1.getText().toString());
    args.putString("contact2", contact2.getText().toString());
    return args;
}