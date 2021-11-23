@java.lang.Override
public void addFront(com.flowpowered.math.vector.Vector3i vector) {
    vector3iTuple[0] = vector;
    if ((currentCapacity) < (maxCapacity)) {
        (currentCapacity)++;
    }
}