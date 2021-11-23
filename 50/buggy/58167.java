@java.lang.Override
public void addBack(com.flowpowered.math.vector.Vector3i vector) {
    vector3iTuple[1] = vector;
    if ((currentCapacity) < (maxCapacity)) {
        (currentCapacity)++;
    }
}