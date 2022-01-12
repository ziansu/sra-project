@java.lang.Override
public java.lang.String toString() {
    if (this.components.isEmpty()) {
        return "/";
    }
    java.lang.String pathStr = new java.lang.String();
    for (java.lang.String component : this.components) {
        pathStr = pathStr.concat(("/" + component));
    }
    return pathStr;
}