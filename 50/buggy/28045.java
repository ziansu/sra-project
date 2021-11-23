public boolean canBeSelected() {
    return (!(isDirectory())) && (getEntry().getName().endsWith(".jpg"));
}