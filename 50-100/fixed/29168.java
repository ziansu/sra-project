@org.junit.Test
public void testSize() {
    for (int size : new int[]{ 1 , 2 , 3 , 99 , 102342 }) {
        org.raistlic.common.adt.BitMap bitMap = org.raistlic.common.adt.BitMap.builder(size).get();
        org.fest.assertions.api.Assertions.assertThat(bitMap.size()).isEqualTo(size);
    }
}