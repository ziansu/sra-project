@org.junit.Test
public void addItems() {
    cart.add(john, new fr.unice.polytech.isa.tcf.entities.Item(fr.unice.polytech.isa.tcf.entities.Cookies.CHOCOLALALA, 2));
    cart.add(john, new fr.unice.polytech.isa.tcf.entities.Item(fr.unice.polytech.isa.tcf.entities.Cookies.DARK_TEMPTATION, 3));
    fr.unice.polytech.isa.tcf.entities.Item[] oracle = new fr.unice.polytech.isa.tcf.entities.Item[]{ new fr.unice.polytech.isa.tcf.entities.Item(fr.unice.polytech.isa.tcf.entities.Cookies.CHOCOLALALA, 2) , new fr.unice.polytech.isa.tcf.entities.Item(fr.unice.polytech.isa.tcf.entities.Cookies.DARK_TEMPTATION, 3) };
    assertEquals(new java.util.HashSet(java.util.Arrays.asList(oracle)), cart.contents(john));
    assertEquals(2, 1);
}