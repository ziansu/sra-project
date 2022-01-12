@org.junit.Test
public void testSize() {
    Array<java.lang.Integer> list = new Array();
    int[] elems = new int[]{ -76 , 45 , 66 , 3 , 234 , 54 , 33 };
    for (int i = 0, sz = 1; i < (elems.length); i++ , sz++) {
        list.add(elems[i]);
        org.junit.Assert.assertEquals(list.size(), sz);
    }
}