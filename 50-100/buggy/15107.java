public static java.util.List<java.lang.String> getAllUnitTags(nationGen.units.Unit u) {
    java.util.List<java.lang.String> tags = new java.util.ArrayList<java.lang.String>();
    tags.addAll(u.race.tags);
    tags.addAll(u.pose.tags);
    for (nationGen.entities.Filter f : u.appliedFilters)
        tags.addAll(f.tags);
    
    for (nationGen.entities.Theme t : u.race.themefilters)
        tags.addAll(t.tags);
    
    for (nationGen.items.Item i : u.slotmap.values())
        tags.addAll(i.tags);
    
    return tags;
}