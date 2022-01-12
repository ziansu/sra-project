public void addURL(java.lang.String url) {
    if ((this.hostname) != null) {
        if (!(getHost(url).equals(this.hostname)))
            return ;
        
        undiscovered.add(removeSpace(url));
    }else {
        this.hostname = getHost(url);
        undiscovered.add(url);
    }
}