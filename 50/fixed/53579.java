boolean matches(javax.servlet.http.HttpServletRequest httpServletRequest) {
    if (satisfied.get())
        return false;
    
    boolean matched = stubMethodMatches(httpServletRequest);
    if (matched)
        satisfied.set(true);
    
    return matched;
}