@java.lang.Override
public float getEnergy() {
    int sum = 0;
    for (int i = 0; i < 6; i++) {
        if ((neighbors[i]) == null)
            continue;
        
        net.minecraftforge.fluids.IFluidHandler f = neighbors[i];
        if (f != null)
            sum += neighbors[i].drain(faces[i].getOpposite(), java.lang.Integer.MAX_VALUE, false).amount;
        
    }
    return sum;
}