private void renew(java.lang.String name, java.util.List<nu.xom.Attribute> atts) {
    nu.xom.Element e = new_element(name);
    if (renewable.contains(name.toUpperCase()))
        if (atts == null)
            get_renew().push(e);
        else {
            for (nu.xom.Attribute a : atts)
                e.addAttribute(a);
            
            get_renew().push(e);
        }
    
}