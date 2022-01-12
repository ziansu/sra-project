@java.lang.Override
public void addPosten(model.Posten posten) {
    int key;
    int lastElement = (this.ausgaben.size()) - 1;
    if (lastElement > (-1))
        key = this.ausgaben.get(lastElement).getKey();
    else
        key = 0;
    
    posten.setKey((key + 1));
    this.ausgaben.add(posten);
}