@java.lang.Override
public java.lang.Boolean getunicodePUA() {
    for (int i = 0; i < (toUnicode.length()); ++i) {
        char unicode = this.toUnicode.charAt(i);
        if ((unicode >= (org.verapdf.gf.model.impl.operator.textshow.GFGlyph.UNICODE_PRIVATE_USE_AREA_BEGINNING)) && (unicode <= (org.verapdf.gf.model.impl.operator.textshow.GFGlyph.UNICODE_PRIVATE_USE_AREA_ENDING))) {
            return true;
        }
    }
    return false;
}