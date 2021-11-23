@java.lang.Override
protected void changed() {
    haven.Utils.setpref(hcommand, super.text);
    Config.hcommands[idx] = super.text;
}