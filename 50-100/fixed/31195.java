public static <E> void testRemoveAndGetFromTail(Collection.Concrete.ArrayList<E> myList) {
    E get;
    E remove;
    for (int i = (myList.size()) - 1; i >= 0; i--) {
        get = myList.get(i);
        remove = myList.remove(i);
        util.TestUtil.assertEquals(get, remove);
        assertEquals(i, myList.size());
    }
    assertEquals(0, myList.size());
}