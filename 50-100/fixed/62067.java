public void onClick(android.view.View v) {
    int length = bt_id.length;
    for (int x = 0; x < length; x++) {
        if ((v.getId()) == (bt_id[x])) {
            android.content.Intent open = new android.content.Intent(this, com.example.neab.rdep.Menu.activities[x]);
            startActivity(open);
            break;
        }
    }
}