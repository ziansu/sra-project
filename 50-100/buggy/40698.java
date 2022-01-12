@org.junit.Test
public void mergeTwoList() {
    java.util.ArrayList<java.lang.String> listOne = new java.util.ArrayList<java.lang.String>();
    listOne.add("foo");
    java.util.ArrayList<java.lang.String> listTwo = new java.util.ArrayList<java.lang.String>();
    listOne.add("bar");
    java.util.ArrayList<java.lang.String> expectedList = new java.util.ArrayList<java.lang.String>();
    expectedList.add("foo");
    expectedList.add("bar");
    org.junit.Assert.assertEquals(expectedList, ar.fiuba.tdd.grupo10.nikoligames.helpers.ListHelper.merge(listOne, listTwo));
}