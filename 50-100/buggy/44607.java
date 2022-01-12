public void setName(java.lang.String name_string) {
    for (int i = 0; i < ((int) (array_size)); ++i) {
        names.set(i, (((name_string + '[') + ((indexOffset) + i)) + ']'));
        array_elements.get(i).setName(names.get(i));
    }
}