boolean matches(javax.servlet.http.HttpServletRequest httpServletRequest) {
    if (satisfied)
        return false;
    
    boolean matched = stubMethodMatches(httpServletRequest);
    if (matched)
        satisfied = true;
    
    return matched;
}