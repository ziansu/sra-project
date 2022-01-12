public void confirmTitle(java.lang.String textToWrite) {
    if (!(textToWrite.contains("---"))) {
        workingWithGroup = true;
        setTitle(("Group Tag: " + (groupName)));
        setContentView(R.layout.activity_write_nfc_group_tag);
        android.widget.TextView t = ((android.widget.TextView) (findViewById(R.id.help_msg)));
        t.setText("You can attach a tag to a container (e.g. backpack) to count for all the items in the Group. When the tag is scanned, all the Group's Items will be checked off. Now hold your phone to the tag!");
        t.setTextSize(21);
    }
}