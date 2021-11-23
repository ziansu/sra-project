public objects.Nutrient get(objects.Nutrient type) {
    for (objects.Nutrient n : nutrients) {
        if (n.equals(type)) {
            return n;
        }
    }
    return null;
}