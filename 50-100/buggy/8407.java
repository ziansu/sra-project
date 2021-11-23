@java.lang.Override
public void setCurrentToggleState(java.lang.String key) {
    for (int i = 0; i < (states.size()); i++) {
        if (states.get(i).getKey().equals(key)) {
            currentStateIndex = i;
            return ;
        }
    }
    throw new java.lang.IllegalArgumentException("No Toggle States match the key you have given");
}