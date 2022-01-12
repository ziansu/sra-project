@java.lang.Override
public void update(java.lang.String id, ru.evgenyhodz.Store.Role value) {
    for (int i = 0; i < (arraySize); i++) {
        if ((simpleArray.get(i).getId().equals(id)) && ((simpleArray.get(i)) != null)) {
            this.simpleArray.update(java.lang.Integer.parseInt(simpleArray.get(i).getId()), value);
        }
    }
}