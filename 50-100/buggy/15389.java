private void putChild(java.lang.String childName, jace.config.Configuration.ConfigNode newChild) {
    removeChild(childName);
    int index = 0;
    for (jace.config.Configuration.ConfigNode node : children) {
        int compare = node.toString().compareToIgnoreCase(childName);
        if (compare >= 0) {
            break;
        }else {
            index++;
        }
    }
    children.add(index, newChild);
}