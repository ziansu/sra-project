public void onClick(android.view.View v) {
    for (int x = 0; x < (bt_id.length); x++) {
        if ((v.getId()) == (bt_id[x])) {
            android.content.Intent open = new android.content.Intent(this, com.example.neab.rdep.Menu.activities[x]);
            startActivity(open);
            break;
        }
    }
}