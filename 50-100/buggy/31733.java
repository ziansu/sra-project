public void remove(java.lang.String uri) {
    synchronized(this) {
        java.lang.Iterable<java.lang.String> rem = map.remove(uri).get();
        for (int i = getKeys().size(); i < (this.buffer); i++) {
            if (stremResource.hasNext())
                addFromResource(stremResource);
            
        }
    }
}