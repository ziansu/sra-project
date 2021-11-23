@java.lang.Override
public boolean apply(org.terasology.math.Vector3i input) {
    return (java.lang.Math.abs(noiseGen.noise(input.getX(), input.getY(), input.getZ()))) < density;
}