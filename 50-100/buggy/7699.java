@org.junit.Test
public void foo() {
    net.praqma.codeacademy.gildedrose.Item[] items = new net.praqma.codeacademy.gildedrose.Item[]{ new net.praqma.codeacademy.gildedrose.Item("foo", 0, 0) };
    net.praqma.codeacademy.gildedrose.GildedRose app = new net.praqma.codeacademy.gildedrose.GildedRose(items);
    app.updateQuality();
    assertEquals("fixme", app.items[0].name);
}