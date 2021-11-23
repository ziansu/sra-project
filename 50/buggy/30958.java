static java.lang.String jsonFor(java.lang.String name) {
    if (name.equals("small"))
        return Json.SMALL;
    
    if (name.equals("action_label"))
        return Json.ACTION_LABEL;
    
    throw new java.lang.IllegalArgumentException(("unknown name: " + name));
}