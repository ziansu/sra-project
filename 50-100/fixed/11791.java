public void onClick(android.content.DialogInterface dialog, int id) {
    java.lang.String name = userInput.getText().toString();
    if (!(com.nineworldsdeep.gauntlet.Utils.stringIsNullOrWhitespace(name))) {
        com.nineworldsdeep.gauntlet.tapestry.v1.ConfigFile f = new com.nineworldsdeep.gauntlet.tapestry.v1.ConfigFile();
        f.setDeviceName(name);
        f.save();
        com.nineworldsdeep.gauntlet.Utils.toast(this, "device name stored");
    }else {
        com.nineworldsdeep.gauntlet.Utils.toast(this, "invalid device name");
    }
}