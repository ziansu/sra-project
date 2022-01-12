@java.lang.Override
public java.lang.String validateConfLength(java.lang.String confLength, java.lang.String igHl7Version) {
    if ((igHl7Version.compareTo("2.5.1")) > 0) {
        if (confLength == null) {
            return "Conf. Length cannot be empty";
        }else {
            java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("\\d*[#=]{0,1}");
            java.util.regex.Matcher m = pattern.matcher(confLength);
            if (!(m.matches())) {
                return "Conf. Length don't match regular expression " + pattern;
            }
        }
    }
    return null;
}