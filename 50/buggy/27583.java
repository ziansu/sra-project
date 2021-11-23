@java.lang.Override
public boolean equals(java.lang.Object obj) {
    if (obj instanceof cz.cuni.mff.d3s.isola2016.antsim.FoodSource) {
        cz.cuni.mff.d3s.isola2016.antsim.FoodSource other = ((cz.cuni.mff.d3s.isola2016.antsim.FoodSource) (obj));
        return (position) == (other.position);
    }else {
        return false;
    }
}