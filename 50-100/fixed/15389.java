private void putChild(java.lang.String id, jace.config.Configuration.ConfigNode newChild) {
    removeChild(id);
    int index = 0;
    for (jace.config.Configuration.ConfigNode node : children) {
        int compare = node.toString().compareToIgnoreCase(id);
        if (compare >= 0) {
            break;
        }else {
            index++;
        }
    }
    children.add(index, newChild);
}