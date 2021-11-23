@org.junit.Test
public void removeAllSame() {
    int size = 100;
    while (!(PQTestKarl.allsame.isEmpty())) {
        size--;
        assertTrue("Remove Max didn't return correct value.", ((PQTestKarl.allsame.peek()) == 1));
        PQTestKarl.allsame.remove();
        assertTrue("Remove Max didn't update size.", ((PQTestKarl.largetosmall.size()) == size));
    } 
}