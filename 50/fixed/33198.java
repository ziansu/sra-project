private static void add(int value) {
    if ((week2.Array.nums.length) <= (week2.Array.size)) {
        week2.Array.copyArray();
    }
    week2.Array.nums[((week2.Array.size)++)] = value;
}