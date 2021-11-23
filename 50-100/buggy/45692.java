public int hashCode() {
    int hash = 5;
    hash = (41 * hash) + (this.role.hashCode());
    hash = (41 * hash) + (this.color.hashCode());
    hash = (41 * hash) + (this.weight);
    return hash;
}