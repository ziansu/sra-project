@java.lang.Override
public ru.evgenyhodz.Store.User get(java.lang.String id) {
    ru.evgenyhodz.Store.User result = null;
    for (int y = 0; y < (arraySize); y++) {
        if (((simpleArray.get(y)) != null) && (simpleArray.get(y).getId().equals(id))) {
            result = simpleArray.get(y);
            if (result != null) {
                break;
            }
        }else {
            throw new java.util.NoSuchElementException("There is no such User.");
        }
    }
    return result;
}