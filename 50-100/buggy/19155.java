@java.lang.Override
public boolean equals(final java.lang.Object other) {
    if (!(other instanceof com.health.Column)) {
        return false;
    }
    com.health.Column that = ((com.health.Column) (other));
    return (((this.index) == (that.index)) && ((this.type) == (that.type))) && (this.name.equals(that.name));
}