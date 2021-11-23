@java.lang.Override
public java.lang.String getTranslatedText() {
    java.lang.String translatedText = base.getTranslatedText();
    return jp.codic.plugins.netbeans.utils.CodicUtils.convertTo(translatedText, casing);
}