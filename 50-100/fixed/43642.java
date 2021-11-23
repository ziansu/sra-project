@java.lang.Override
public boolean equals(java.lang.Object obj) {
    boolean result = false;
    if (obj instanceof robot.Vertex) {
        robot.Vertex other = ((robot.Vertex) (obj));
        if (c.equals(other.getC())) {
            result = true;
        }
    }
    return result;
}