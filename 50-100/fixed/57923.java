public static void main(java.lang.String[] args) {
    net.majsokrafo.groundsofthefallen.BoardHalf half1 = new net.majsokrafo.groundsofthefallen.BoardHalf(5, 3, 8);
    net.majsokrafo.groundsofthefallen.BoardHalf half2 = new net.majsokrafo.groundsofthefallen.BoardHalf(5, 3, 8);
    half1.getUnits()[0][0] = new net.majsokrafo.groundsofthefallen.KinfolkBrave();
    java.lang.System.out.println(half1.moveUnit(half2, 0, 0, 1, 1));
}