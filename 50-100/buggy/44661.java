@org.jetbrains.annotations.Contract(value = "null->false", pure = true)
public boolean equals(@javax.annotation.Nullable
illarion.common.types.ServerCoordinate serverCoordinate) {
    return (((serverCoordinate != null) && ((serverCoordinate.x) == (x))) && ((serverCoordinate.x) == (y))) && ((serverCoordinate.z) == (z));
}