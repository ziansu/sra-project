@java.lang.Override
public boolean apply(org.terasology.math.Vector3i input) {
    return (noiseGen.noise(input.getX(), input.getY(), input.getZ())) < density;
}