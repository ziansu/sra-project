public static java.lang.String getTypeFromUrl(android.content.Context c, java.lang.String url) {
    if (url.contains("anime"))
        return c.getString(R.string.anime);
    else
        if (url.contains("manga"))
            return c.getString(R.string.manga);
        else
            if (url.contains("characters"))
                return c.getString(R.string.character);
            
        
    
    return "";
}