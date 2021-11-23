@gate.creole.metadata.CreoleParameter(comment = "The character used to separate features for entries in gazetteer lists. Accepts strings like &quot;\t&quot; and will unescape it to the relevant character. If not specified, a tab character will be used", defaultValue = "\\t")
@gate.creole.metadata.Optional
public void setGazetteerFeatureSeparator(java.lang.String sep) {
    gazetteerFeatureSeparator = sep;
    if ((sep == null) || (sep.isEmpty())) {
        unescapedSeparator = gate.util.Strings.unescape("\\t");
    }else {
        unescapedSeparator = gate.util.Strings.unescape(sep);
    }
}