private void initCallFunction() {
    android.widget.ImageButton phone = ((android.widget.ImageButton) (findViewById(R.id.imageButtonCall)));
    phone.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            callContact(currentContact.getCellNumber());
        }
    });
    android.widget.ImageButton cell = ((android.widget.ImageButton) (findViewById(R.id.imageButtonCallHome)));
    cell.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            callContact(currentContact.getPhoneNumber());
        }
    });
}