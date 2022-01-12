private static void Subtract(double[] p_source, double[] p_value, double[] p_destination) {
    for (int i = 0; i < ((p_source.length) - 1); i++)
        p_destination[i] = (p_source[i]) - (p_value[i]);
    
}