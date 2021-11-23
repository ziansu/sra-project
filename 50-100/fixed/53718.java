private java.net.URL toURL(java.lang.Object updateUrl) {
    try {
        if (updateUrl == null)
            return null;
        else
            if (updateUrl instanceof java.net.URL)
                return ((java.net.URL) (updateUrl));
            else
                if (updateUrl instanceof java.net.URI)
                    return ((java.net.URI) (updateUrl)).toURL();
                else
                    return new java.net.URL(((java.lang.String) (updateUrl.toString())));
                
            
        
    } catch (java.net.MalformedURLException e) {
        throw new java.lang.IllegalArgumentException(e);
    }
}