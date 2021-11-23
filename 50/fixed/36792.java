private java.lang.String mediaBrief() {
    return (task().getMedia()) == null ? task().getMedia().abbreviation() : "";
}