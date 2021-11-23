public static <T> T avoidNull(T t, T Default) {
    if (t == null)
        try {
            return Default;
        } catch (java.lang.Throwable throwable) {
            throw net.cassite.style.Core.$(throwable);
        }
    else
        return t;
    
}