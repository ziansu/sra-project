@java.lang.Override
public java.lang.String getCategory(java.lang.String signal) {
    for (java.lang.String cat : categories) {
        if (signal.contains((cat + "."))) {
            return cat;
        }
    }
    return categories.get(((categories.size()) - 1));
}