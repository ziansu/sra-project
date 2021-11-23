public static boolean isInputMatch(org.rapidcontext.core.web.Request request, java.lang.String[] mimes) {
    if ((request.getContentType()) == null) {
        return false;
    }else {
        return org.rapidcontext.core.web.Mime.isMatch(request.getContentType(), mimes);
    }
}