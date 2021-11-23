@java.lang.Override
public boolean equals(java.lang.Object other) {
    if (!(other instanceof com.orbekk.same.State.Component)) {
        return false;
    }
    com.orbekk.same.State.Component o = ((com.orbekk.same.State.Component) (other));
    return (((name) == (o.name)) && ((data) == (o.data))) && ((revision) == (o.revision));
}