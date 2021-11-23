@java.lang.Override
public int getHeatCapacity() {
    return (getHeatSinks()) * ((getHeatType()) + 1);
}