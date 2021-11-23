void add(java.lang.String entry) {
    entry.matches(" *import .*;");
    if (entry.matches(" *import .*;"))
        imports.add(entry);
    
    lastEntryWasOrder = false;
    if (entry.matches("}.*"))
        methods.add(entry.substring(1));
    
    lastEntryWasOrder = false;
    orders.add(entry);
    lastEntryWasOrder = true;
}