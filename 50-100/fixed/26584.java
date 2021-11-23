@com.xenoage.utils.annotations.Optimized(value = com.xenoage.utils.annotations.Optimized.Reason.Performance)
public static com.xenoage.utils.color.Color color(int r, int g, int b, int a) {
    for (com.xenoage.utils.color.Color c : com.xenoage.utils.color.Color.shared)
        if ((((r == (c.r)) && (g == (c.g))) && (b == (c.b))) && (a == (c.a)))
            return c;
        
    
    return new com.xenoage.utils.color.Color(r, g, b, a);
}