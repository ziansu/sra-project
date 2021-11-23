public static void main(java.lang.String[] args) {
    java.util.List<java.util.List<java.lang.Integer>> sol1 = Problem5.solve(1, new int[]{ 1 , 2 , 3 , 4 });
    int counter1 = Problem5.solve2(1, new int[]{ 1 , 2 , 3 , 4 });
    Problem5.prinSolution(sol1);
    java.lang.System.out.println(("Number of solutions: " + counter1));
}