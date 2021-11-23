public static long solve() {
    long ans = 0;
    for (int x = 0; x < (Euler22.array.length); x++)
        ans += (Euler22.digitMode(Euler22.array[x])) * (x + 1);
    
    return ans;
}