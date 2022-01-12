@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (!(object instanceof fatfractioncalculator.Coordinate)) {
        return false;
    }else {
        fatfractioncalculator.Shape compare = ((fatfractioncalculator.Shape) (object));
        return (((compare.getX()) == (x)) && ((compare.getY()) == (y))) && ((compare.getZ()) == (z));
    }
}