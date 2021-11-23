@java.lang.Override
public void delete(java.lang.String id) {
    for (int i = 0; i < (arraySize); i++) {
        if ((simpleArray.get(i).getId().equals(id)) && ((simpleArray.get(i)) != null)) {
            this.simpleArray.delete(java.lang.Integer.parseInt(simpleArray.get(i).getId()));
            break;
        }
    }
}