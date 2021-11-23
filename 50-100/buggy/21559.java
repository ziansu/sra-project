public java.lang.String toString() {
    int id = menuID.get();
    java.lang.String name = menuName.get();
    int cost = (menuCost.get()) * (menuAmount.get());
    int amount = menuAmount.get();
    java.lang.String sentence = ((((((("ID: " + id) + ", Name: ") + name) + ", Cost: ") + cost) + ", Amount: ") + amount) + "\n\n";
    return sentence;
}