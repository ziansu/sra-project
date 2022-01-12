@java.lang.Override
public java.util.List<java.lang.String> getProperties(java.lang.String player) {
    java.util.List<java.lang.String> propertyList = new java.util.ArrayList<java.lang.String>();
    for (a4.domain.Property curr : properties) {
        if ((curr.getOwner()) != null)
            if (curr.getOwner().toString().equals(player)) {
                propertyList.add(curr.toString());
            }
        
    }
    return propertyList;
}