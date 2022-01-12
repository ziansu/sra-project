public static java.util.ArrayList<java.lang.Integer> genSubset(int size, int low, int high) {
    java.util.ArrayList<java.lang.Integer> ary = new java.util.ArrayList<>();
    int count = 0;
    java.util.Random gen = new java.util.Random();
    while (count < size) {
        int num = (gen.nextInt((high - low))) + low;
        if (!(ary.contains(num))) {
            ary.add(num);
            count++;
        }
    } 
    return ary;
}