@java.lang.Override
public java.lang.String validate(java.lang.Object fieldValue) {
    java.util.regex.Matcher matcher = pattern.get().matcher((fieldValue != null ? fieldValue.toString() : "_dontMatch_"));
    if (matcher.matches()) {
        return null;
    }else
        if (msg.isPresent()) {
            return msg.get();
        }else {
            return "Password is not valid";
        }
    
}