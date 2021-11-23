@java.lang.Override
public int compareTo(models.Record other) {
    if (((this.created) != null) && ((other.created) != null)) {
        return -(this.created.compareTo(other.created));
    }else {
        return super.compareTo(other);
    }
}