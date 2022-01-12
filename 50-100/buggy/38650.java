private void renew(java.lang.String name, java.util.List<nu.xom.Attribute> atts) {
    if (renewable.contains(name.toUpperCase()))
        if (atts == null)
            get_renew().push(new_element(name));
        else
            for (nu.xom.Attribute a : atts) {
                nu.xom.Element e = new_element(name);
                e.addAttribute(a);
                get_renew().push(e);
            }
        
    
}