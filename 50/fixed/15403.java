@org.junit.Test
public void testEqualsTrue() {
    main.BoundingBox boundingBox1 = new main.BoundingBox(67, 129, 1, 2);
    main.BoundingBox boundingBox2 = new main.BoundingBox(67, 129, 1, 2);
    org.junit.Assert.assertEquals(boundingBox1, boundingBox2);
}