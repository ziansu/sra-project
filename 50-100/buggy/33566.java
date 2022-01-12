public static com.gfom.ts.triangle.TriangleType classifyTriangle(com.gfom.ts.triangle.Triangle triangle) throws java.lang.IllegalArgumentException {
    if (com.gfom.ts.triangle.validator.TriangleValidator.checkTriangle(triangle)) {
        throw new java.lang.IllegalArgumentException("The object does not classify as a triangle");
    }
    if (com.gfom.ts.triangle.validator.TriangleValidator.isEquilateral(triangle)) {
        return com.gfom.ts.triangle.TriangleType.equilateral;
    }
    if (com.gfom.ts.triangle.validator.TriangleValidator.isIsoceles(triangle)) {
        return com.gfom.ts.triangle.TriangleType.isosceles;
    }
    return com.gfom.ts.triangle.TriangleType.scalene;
}