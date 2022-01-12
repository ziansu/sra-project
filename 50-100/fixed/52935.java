@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (!(object instanceof fatfractioncalculator.Shape)) {
        return false;
    }else {
        fatfractioncalculator.Shape compare = ((fatfractioncalculator.Shape) (object));
        return (((compare.getX()) == (x)) && ((compare.getY()) == (y))) && ((compare.getZ()) == (z));
    }
}