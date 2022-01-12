@java.lang.Override
public boolean equals(java.lang.Object obj) {
    boolean result = false;
    if (obj instanceof robot.Vertex) {
        robot.Vertex other = ((robot.Vertex) (obj));
        java.lang.System.out.println(((("Comparing :" + (this)) + " and ") + other));
        if (c.equals(other.getC())) {
            java.lang.System.out.println("They are the same ! ");
            result = true;
        }
    }
    return result;
}