@java.lang.Override
public void addPosten(model.Posten posten) {
    int lastElement = (this.ausgaben.size()) - 1;
    int key = this.ausgaben.get(lastElement).getKey();
    posten.setKey((key + 1));
    this.ausgaben.add(posten);
}