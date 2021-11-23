@org.junit.Test
public void testDistance3DTwoPositions() {
    for (int i = -400; i < 400; i += 20) {
        final net.minecraft.util.math.BlockPos posA = new net.minecraft.util.math.BlockPos((i * i), (i % 200), (i * 2));
        final net.minecraft.util.math.BlockPos posB = new net.minecraft.util.math.BlockPos(i, ((i + 100) % 200), ((i * i) * i));
        testDistance3D(posA, posB);
    }
}