@java.lang.Override
public ru.evgenyhodz.Store.User get(java.lang.String id) {
    ru.evgenyhodz.Store.User result = null;
    for (int y = 0; y < (arraySize); y++) {
        if ((simpleArray.get(y).getId().equals(id)) && ((simpleArray.get(y)) != null)) {
            result = simpleArray.get(y);
        }else {
            if (result == null) {
                throw new java.util.NoSuchElementException("There is no such User.");
            }
        }
    }
    return result;
}