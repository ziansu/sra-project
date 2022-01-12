public void add(br.com.riselabs.cotonet.model.beans.DeveloperNode dev) {
    if ((this.devs) == null) {
        this.devs = new java.util.HashMap<java.lang.Integer, br.com.riselabs.cotonet.model.beans.DeveloperNode>();
    }
    this.devs.put(((this.devs.size()) + 1), dev);
}