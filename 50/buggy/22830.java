@java.lang.Override
public java.lang.String getString(java.lang.String name) {
    if (stringMap.containsKey(name)) {
        return stringMap.get(name);
    }else {
        throw new java.lang.NullPointerException((("The string \"" + name) + "\" was not found!"));
    }
}