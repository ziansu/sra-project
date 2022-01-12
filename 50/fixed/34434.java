@java.lang.Override
public int getStringWidth(java.lang.String s) {
    return super.getStringWidth(killEmotes(s));
}