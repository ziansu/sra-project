public int countChilds() {
    int size = folders.stream().mapToInt(( folder) -> folder.countChilds()).sum();
    size += ((files.size()) + 1) + size;
    return this.size = size;
}