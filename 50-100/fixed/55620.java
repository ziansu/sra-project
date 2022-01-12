private java.lang.String randomVehicle() {
    int[] nums = new int[]{ 39 , 40 , 50 , 58 , 59 , 67 , 74 , 75 , 81 , 82 , 83 , 89 , 90 , 91 };
    int index = random.nextInt(nums.length);
    return java.lang.String.format("vehicle_%s", nums[index]);
}