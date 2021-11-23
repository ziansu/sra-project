static java.lang.String jsonFor(java.lang.String name) {
    if ("small".equals(name)) {
        return Json.SMALL;
    }
    if ("action_label".equals(name)) {
        return Json.ACTION_LABEL;
    }
    throw new java.lang.IllegalArgumentException(("unknown name: " + name));
}