@org.junit.Test
public void testDistance2DTwoPositions() {
    for (int i = -400; i < 400; i += 20) {
        final net.minecraft.util.math.BlockPos posA = new net.minecraft.util.math.BlockPos((i * i), 0, (i * 2));
        final net.minecraft.util.math.BlockPos posB = new net.minecraft.util.math.BlockPos(i, 0, ((i * i) * i));
        testDistance2D(posA, posB);
    }
}