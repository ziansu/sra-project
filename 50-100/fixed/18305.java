public bt.elements.unit.RandomName GetRandomName() {
    checkAvailableRandomNames();
    int index = bt.util.Dice.random(_RandomNames.size());
    if (index == (_RandomNames.size()))
        index--;
    
    bt.elements.unit.RandomName name = _RandomNames.elementAt(index);
    _ServedNames.add(name);
    _RandomNames.remove(index);
    return name;
}