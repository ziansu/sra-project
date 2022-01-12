@java.lang.Override
protected void changed() {
    if ((super.text.length()) > 0) {
        haven.Utils.setpref(hcommand, super.text);
        Config.hcommands[idx] = super.text;
    }
}