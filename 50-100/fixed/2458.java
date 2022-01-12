public static java.awt.Color getOfficialColor(java.lang.Object animal) {
    if (((animal instanceof Bear) || (animal instanceof Fox)) || (animal instanceof Rabbit)) {
        Animal a = ((Animal) (animal));
        return a.getOfficialColor();
    }else
        if (animal instanceof Hunter) {
            Hunter h = ((Hunter) (animal));
            return h.getOfficialColor();
        }
    
    return null;
}