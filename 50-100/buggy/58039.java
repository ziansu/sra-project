public void addURL(java.lang.String url) {
    if ((this.hostname) != null) {
        if ((getHost(url)) != (this.hostname))
            return ;
        
        undiscovered.add(removeSpace(url));
    }else {
        this.hostname = getHost(url);
        undiscovered.add(url);
    }
}