@java.lang.Override
public boolean equals(java.lang.Object o) {
    com.jasonjohn.unchainedapi.UnchainedRestaurant r = ((com.jasonjohn.unchainedapi.UnchainedRestaurant) (o));
    java.lang.String name1 = this.getName();
    java.lang.String name2 = r.getName();
    name1 = com.jasonjohn.unchainedapi.Util.normalizeVenueName(name1);
    name2 = com.jasonjohn.unchainedapi.Util.normalizeVenueName(name2);
    if (name1.equals(name2)) {
        return true;
    }else
        return false;
    
}