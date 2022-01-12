public void removeDashes(java.util.List<core.Tag> tags) {
    java.lang.String name;
    for (core.Tag t : tags) {
        name = t.getTag();
        t.setTag(name.replaceAll("\\s*-\\s*", " "));
    }
}