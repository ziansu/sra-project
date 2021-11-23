public static im.abe.panda.Template from(java.lang.String text) {
    if (((im.abe.panda.Template.cache) != null) && (im.abe.panda.Template.cache.containsKey(text)))
        return im.abe.panda.Template.cache.get(text);
    
    try {
        im.abe.panda.Template template = im.abe.panda.Template.from(new java.io.BufferedReader(new java.io.StringReader(text)), true);
        if ((im.abe.panda.Template.cache) != null)
            im.abe.panda.Template.cache.put(text, template);
        
        return template;
    } catch (java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}