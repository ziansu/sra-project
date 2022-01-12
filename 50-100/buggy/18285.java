public void visitSite(java.lang.String site) {
    try {
        if (!(this._sim_listofFiles.contains(site))) {
            this._sim_listofSites.add(site);
        }
        this.dao.insert((("Insert into gridsites (label) values('" + site) + "')"));
        this.dao.insert((("Insert into allvisitedsites (label) values('" + site) + "')"));
    } catch (java.lang.Exception e) {
    }
}