@java.lang.Override
public int getStringWidth(java.lang.String s) {
    return super.getStringWidth((net.blay09.mods.eiramoticons.render.FontRendererExt.enableEmoticons ? killEmotes(s) : s));
}