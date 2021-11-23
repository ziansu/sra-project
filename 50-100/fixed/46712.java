@java.lang.Override
public java.lang.CharSequence apply(java.lang.String context, com.github.jknack.handlebars.Options options) throws java.io.IOException {
    if (context == null) {
        return "";
    }
    java.lang.Integer start = options.param(0, null);
    java.lang.Integer end = options.param(1, null);
    if (isIncorrectParameters(context, start, end)) {
        return "";
    }
    if (end == null) {
        return context.substring(start);
    }else {
        return context.substring(start, end);
    }
}